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
join_type = "RIGHTJOIN"
departments_1_branch_id_index=  ExecutionPlanUtilities::get_column_index("departments", "branch_id")
departments_1_branch_id_index=  ExecutionPlanUtilities::get_column_index("departments", "branch_id")
prev_outer_department_id_index =  ExecutionPlanUtilities::get_column_index("employees", "department_id")
departments_1_department_id_index =  ExecutionPlanUtilities::get_column_index("departments", "department_id")



branches_0_table_location, branches_field_terminator = ExecutionPlanUtilities.get_table_location("branches")
branches_0_csv_files = ExecutionPlanUtilities.get_csv_files(branches_0_table_location)
branches_0_file_index = 0
branches_0_pos = 0

until branches_0_file_index == branches_0_csv_files.length

  branches_0_line, branches_0_file_index, branches_0_pos =
    ExecutionPlanUtilities.read_record(branches_0_table_location, branches_0_csv_files, branches_0_file_index, branches_0_pos, branches_field_terminator)

  record_0 = "" + branches_0_line.chomp

  branches_0_joined_flag = false

departments_1_table_location, departments_field_terminator = ExecutionPlanUtilities.get_table_location("departments")
departments_1_csv_files = ExecutionPlanUtilities.get_csv_files(departments_1_table_location)
departments_1_file_index = 0
departments_1_pos = 0

until departments_1_file_index == departments_1_csv_files.length

  departments_1_line, departments_1_file_index, departments_1_pos = ExecutionPlanUtilities.read_record(departments_1_table_location, departments_1_csv_files, departments_1_file_index, departments_1_pos, departments_field_terminator)
  record_1 = record_0 + "," + departments_1_line.chomp

    departments_1_joined_flag = false

    if departments_1_line.split(",")[departments_1_branch_id_index].strip.to_i==departments_1_line.split(",")[departments_1_branch_id_index].strip.to_i

            branches_0_joined_flag = true

            records << record_1

    end


end

 records << ("," * 3) + branches_0_line.chomp unless branches_0_joined_flag


end

FileUtils.mkdir_p("prev/")

prev_outer_file = File.open("prev/prev_file.csv", "w")

prev_outer_file.puts records

prev_outer_file.close

prev_outer_length = 3 + 3


   records = []

      departments_1_table_location, departments_field_terminator = ExecutionPlanUtilities.get_table_location("departments")
      departments_1_csv_files = ExecutionPlanUtilities.get_csv_files(departments_1_table_location)
      departments_1_file_index = 0
      departments_1_pos = 0

      until departments_1_file_index == departments_1_csv_files.length

        departments_1_line, departments_1_file_index, departments_1_pos =
          ExecutionPlanUtilities.read_record(departments_1_table_location, departments_1_csv_files, departments_1_file_index, departments_1_pos, departments_field_terminator)

        record_1 = "" + departments_1_line.chomp

        departments_1_joined_flag = false

      prev_outer_table_location = "prev"
      prev_outer_field_terminator = ","
      prev_outer_csv_files = ExecutionPlanUtilities.get_csv_files(prev_outer_table_location)
      prev_outer_file_index = 0
      prev_outer_pos = 0

      until prev_outer_file_index == prev_outer_csv_files.length

        prev_outer_line, prev_outer_file_index, prev_outer_pos = ExecutionPlanUtilities.read_record(prev_outer_table_location, prev_outer_csv_files, prev_outer_file_index, prev_outer_pos, prev_outer_field_terminator)
        record = record_1 + "," + prev_outer_line.chomp

          prev_outer_joined_flag = false

          if prev_outer_line.split(",")[prev_outer_department_id_index].strip.to_i==departments_1_line.split(",")[departments_1_department_id_index].strip.to_i

                  departments_1_joined_flag = true

                  records << record

          end


      end

       records << ("," * prev_outer_length) + departments_1_line.chomp unless departments_1_joined_flag


      end



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
