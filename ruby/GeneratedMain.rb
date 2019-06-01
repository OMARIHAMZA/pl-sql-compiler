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


  ExecutionPlanUtilities::write_to_execution_plan("Nested Loop Join")
join_type = "JOIN"
employees_1_department_id_index=  ExecutionPlanUtilities::get_column_index("employees", "department_id")
departments_0_department_id_index=  ExecutionPlanUtilities::get_column_index("departments", "department_id")



   ExecutionPlanUtilities::write_to_execution_plan("Nested Loop Join")

  employees_1_table_location, employees_1_field_terminator = ExecutionPlanUtilities.get_table_location("employees")
      employees_1_csv_files = ExecutionPlanUtilities.get_csv_files(employees_1_table_location, "employees")
      employees_1_file_index = 0
      employees_1_pos = 0

      until employees_1_file_index == employees_1_csv_files.length

        employees_1_line, employees_1_file_index, employees_1_pos = ExecutionPlanUtilities.read_record(employees_1_table_location, employees_1_csv_files, employees_1_file_index, employees_1_pos, employees_1_field_terminator)
        record_1 = employees_1_line.chomp

          departments_0_table_location, departments_0_field_terminator = ExecutionPlanUtilities.get_table_location("departments")
            departments_0_csv_files = ExecutionPlanUtilities.get_csv_files(departments_0_table_location, "departments")
            departments_0_file_index = 0
            departments_0_pos = 0

            until departments_0_file_index == departments_0_csv_files.length

              departments_0_line, departments_0_file_index, departments_0_pos = ExecutionPlanUtilities.read_record(departments_0_table_location, departments_0_csv_files, departments_0_file_index, departments_0_pos, departments_0_field_terminator)
              record_0 = record_1 + departments_0_line.chomp

                if employees_1_line.split(",")[employees_1_department_id_index].strip.to_i==departments_0_line.split(",")[departments_0_department_id_index].strip.to_i

                    records << employees_1_line.chomp + "," + departments_0_line.chomp

                end


            end


      end

      FileUtils.mkdir_p("prev/")

      prev_join_file = File.open("prev/prev_file.csv", "w")

      prev_join_file.puts records

      prev_join_file.close

      prev_join_length = 3 + 4

  

having_conditions = []
aggregation_columns = []



if aggregation_columns.empty?


end

records.sort_by!{|record| [ ]}
  records, record_length = ExecutionPlanUtilities::process_analytic_function(records, [ExecutionPlanUtilities::get_column_index("DEPARTMENTS", "DEPARTMENT_NAME"),], {:function=>:MAX,:index=>ExecutionPlanUtilities::get_column_index("employees", "salary"),:type=>:INT,:distinct=>nil},)

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

puts records if aggregation_columns.empty? && ! false

  ExecutionPlanUtilities::write_query_to_file(records, query_counter)
query_counter += 1



ExecutionPlanUtilities::delete_query_files(query_counter)


end

puts Time.now - start
