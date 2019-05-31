gem 'parallel'
require 'parallel'
require 'json'
require 'time'
require 'thwait'
require 'fileutils'
require_relative 'map_reduce'
require_relative 'enumerable'
require_relative 'execution_plan_utilities'

start = Time.now

begin


grouping_columns = []
ordering_columns = []
selection_columns = []
records = []

join_type = "null"
    employees_table_location = ExecutionPlanUtilities.get_table_location("employees")
    employees_csv_files = ExecutionPlanUtilities.get_csv_files(employees_table_location)
    employees_file_index = 0
    employees_pos = 0

    until employees_file_index == employees_csv_files.length

      employees_line, employees_file_index, employees_pos = ExecutionPlanUtilities.read_record(employees_table_location, employees_csv_files, employees_file_index, employees_pos)

      records << employees_line.chomp if true

    end

having_conditions = []
aggregation_columns = []



if aggregation_columns.empty?

selection_columns << 0 + ExecutionPlanUtilities::get_column_index("employees", "employee_name")

end
records.sort_by!{|record| [ ]}
  records, record_length = ExecutionPlanUtilities::process_analytic_function(records, [ExecutionPlanUtilities::get_column_index("EMPLOYEES", "DEPARTMENT_ID"),], {:function=>:MIN,:index=>ExecutionPlanUtilities::get_column_index("employees", "salary"),:type=>:INT,:distinct=>nil},)


selection_columns << record_length
  records, record_length = ExecutionPlanUtilities::process_analytic_function(records, [ExecutionPlanUtilities::get_column_index("EMPLOYEES", "DEPARTMENT_ID"),], {:function=>:MAX,:index=>ExecutionPlanUtilities::get_column_index("employees", "salary"),:type=>:INT,:distinct=>nil},)


selection_columns << record_length

unless selection_columns.empty?
records.map!{|record| record.split(",").values_at(*selection_columns).join(",")}
end

records.uniq! if false
  unless aggregation_columns.empty?

  mapper_file_name = MapReduce::Mapper.new.map(records, grouping_columns, aggregation_columns)

  shuffler_file_name = ""

  shuffler_file_name = MapReduce::Shuffler.new(mapper_file_name).shuffle unless grouping_columns.empty?

  MapReduce::Reducer.new(grouping_columns.empty? ? mapper_file_name : shuffler_file_name, grouping_columns, aggregation_columns, having_conditions).reduce

  puts File.read(MapReduce::REDUCER_RESULT_FILE)

  end

puts records if aggregation_columns.empty?


end

puts Time.now - start
