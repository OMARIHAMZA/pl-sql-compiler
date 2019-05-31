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
join_type = "INNERJOIN"
departments_1_branch_id_index=  ExecutionPlanUtilities::get_column_index("departments", "branch_id")
branches_0_branch_id_index=  ExecutionPlanUtilities::get_column_index("branches", "branch_id")
employees_2_department_id_index =  ExecutionPlanUtilities::get_column_index("employees", "department_id")
prev_join_department_id_index =  ExecutionPlanUtilities::get_column_index("departments", "department_id")


  departments_1_table_location, departments_1_field_terminator = ExecutionPlanUtilities.get_table_location("departments")
      departments_1_csv_files = ExecutionPlanUtilities.get_csv_files(departments_1_table_location)
      departments_1_file_index = 0
      departments_1_pos = 0

      until departments_1_file_index == departments_1_csv_files.length

        departments_1_line, departments_1_file_index, departments_1_pos = ExecutionPlanUtilities.read_record(departments_1_table_location, departments_1_csv_files, departments_1_file_index, departments_1_pos, departments_1_field_terminator)
        record_1 = departments_1_line.chomp

          branches_0_table_location, branches_0_field_terminator = ExecutionPlanUtilities.get_table_location("branches")
            branches_0_csv_files = ExecutionPlanUtilities.get_csv_files(branches_0_table_location)
            branches_0_file_index = 0
            branches_0_pos = 0

            until branches_0_file_index == branches_0_csv_files.length

              branches_0_line, branches_0_file_index, branches_0_pos = ExecutionPlanUtilities.read_record(branches_0_table_location, branches_0_csv_files, branches_0_file_index, branches_0_pos, branches_0_field_terminator)
              record_0 = record_1 + branches_0_line.chomp

                if departments_1_line.split(",")[departments_1_branch_id_index].strip.to_i==branches_0_line.split(",")[branches_0_branch_id_index].strip.to_i

                    records << departments_1_line.chomp + "," + branches_0_line.chomp

                end


            end


      end

      FileUtils.mkdir_p("prev_join/")

      prev_join_file = File.open("prev_join/prev_join.csv", "w")

      prev_join_file.puts records

      prev_join_file.close

      prev_join_length = 3 + 3

  
records = []

employees_2_table_location, employees_2_field_terminator = ExecutionPlanUtilities.get_table_location("employees")
      employees_2_csv_files = ExecutionPlanUtilities.get_csv_files(employees_2_table_location)
      employees_2_file_index = 0
      employees_2_pos = 0

      until employees_2_file_index == employees_2_csv_files.length

        employees_2_line, employees_2_file_index, employees_2_pos = ExecutionPlanUtilities.read_record(employees_2_table_location, employees_2_csv_files, employees_2_file_index, employees_2_pos, employees_2_field_terminator)
        record_2 = employees_2_line.chomp

          prev_join_table_location = "prev_join/"
          prev_join_field_terminator = ","
          prev_join_csv_files = ExecutionPlanUtilities.get_csv_files(prev_join_table_location)
          prev_join_file_index = 0
          prev_join_pos = 0

            until prev_join_file_index == prev_join_csv_files.length

              prev_join_line, prev_join_file_index, prev_join_pos = ExecutionPlanUtilities.read_record(prev_join_table_location, prev_join_csv_files, prev_join_file_index, prev_join_pos, prev_join_field_terminator)
              record = record_2 + prev_join_line.chomp

                if employees_2_line.split(",")[employees_2_department_id_index].strip.to_i==prev_join_line.split(",")[prev_join_department_id_index].strip.to_i

                    records << employees_2_line.chomp + "," + prev_join_line.chomp

                end


            end


      end

      FileUtils.mkdir_p("prev_join/")

      prev_join_file = File.open("prev_join/prev_join.csv", "w")

      prev_join_file.puts records

      prev_join_file.close

      prev_join_length = prev_join_length + 4

  

  ExecutionPlanUtilities::write_to_execution_plan("Where Condition")

branches_branch_location_index = ExecutionPlanUtilities::get_column_index("branches", "branch_location")

records.keep_if {|record| record.split(",")[7 + branches_branch_location_index]=="Damascus"}
having_conditions = []
aggregation_columns = []



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

puts records if aggregation_columns.empty? && ! false

  ExecutionPlanUtilities::write_query_to_file(records, query_counter)
query_counter += 1



ExecutionPlanUtilities::delete_query_files(query_counter)


end

puts Time.now - start
