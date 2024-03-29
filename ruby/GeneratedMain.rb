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

ExecutionPlanUtilities::init_execution_plan_file()

query_counter = 0


grouping_columns = []
ordering_columns = []
selection_columns = []
records = []

join_type = "null"
    employees_table_location, employees_field_terminator = ExecutionPlanUtilities.get_table_location("employees")
    employees_csv_files = ExecutionPlanUtilities.get_csv_files(employees_table_location, "employees")
    employees_file_index = 0
    employees_pos = 0

    until employees_file_index == employees_csv_files.length

      employees_line, employees_file_index, employees_pos = ExecutionPlanUtilities.read_record(employees_table_location, employees_csv_files, employees_file_index, employees_pos,  employees_field_terminator)

      records << employees_line.chomp if true

    end

having_conditions = [{:function=>:SUM,:index=>1,:condition=>">20000000",:function_after_condition=>false,:type=>:INT},]
aggregation_columns = [{:function=>:SUM,:index=>ExecutionPlanUtilities::get_column_index("employees", "salary"),:type=>:INT,:distinct=>nil},]

grouping_columns << ExecutionPlanUtilities::get_column_index("employees", "department_id") + 0


if aggregation_columns.empty?

selection_columns << 0 + ExecutionPlanUtilities::get_column_index("employees", "department_id")

end

records.sort_by!{|record| [ ]}
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

  puts File.read(ExecutionPlanUtilities::EXECUTION_PLAN_FILE_NAME) if false

puts records if aggregation_columns.empty? && ! false && ! false

  ExecutionPlanUtilities::write_query_to_file(records, query_counter)
query_counter += 1



ExecutionPlanUtilities::delete_query_files(query_counter)


end

puts Time.now - start
