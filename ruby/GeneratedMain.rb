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

aggregation_columns = []


records.sort_by!{|record| [ ]}
unless selection_columns.empty?
records.map!{|record| record.split(",").values_at(*selection_columns).join(",")}
end

records.uniq! if false
  unless aggregation_columns.empty?

  mapper_file_name = MapReduce::Mapper.new.map(records, grouping_columns, aggregation_columns)

  shuffler_file_name = MapReduce::Shuffler.new(mapper_file_name).shuffle

  MapReduce::Reducer.new(shuffler_file_name, grouping_columns, aggregation_columns).reduce

  end
ExecutionPlanUtilities.process_subselect_statement(records, "E", [{"EMPLOYEE_ID":"INT"},{"SALARY":"INT"},{"DEPARTMENT_ID":"INT"},{"EMPLOYEE_NAME":"STRING"}])
records = []
join_type = "null"
    departments_table_location = ExecutionPlanUtilities.get_table_location("departments")
    departments_csv_files = ExecutionPlanUtilities.get_csv_files(departments_table_location)
    departments_file_index = 0
    departments_pos = 0

    until departments_file_index == departments_csv_files.length

      departments_line, departments_file_index, departments_pos = ExecutionPlanUtilities.read_record(departments_table_location, departments_csv_files, departments_file_index, departments_pos)

      records << departments_line.chomp if true

    end

aggregation_columns = []


records.sort_by!{|record| [ ]}
unless selection_columns.empty?
records.map!{|record| record.split(",").values_at(*selection_columns).join(",")}
end

records.uniq! if false
  unless aggregation_columns.empty?

  mapper_file_name = MapReduce::Mapper.new.map(records, grouping_columns, aggregation_columns)

  shuffler_file_name = MapReduce::Shuffler.new(mapper_file_name).shuffle

  MapReduce::Reducer.new(shuffler_file_name, grouping_columns, aggregation_columns).reduce

  end
ExecutionPlanUtilities.process_subselect_statement(records, "D", [{"DEPARTMENT_NAME":"STRING"},{"DEPARTMENT_ID":"INT"},{"BRANCH_ID":"INT"}])
records = []
join_type = "JOIN"
e_1_department_id_index=  ExecutionPlanUtilities::get_column_index("e", "department_id")
d_0_department_id_index=  ExecutionPlanUtilities::get_column_index("d", "department_id")
e_1_table_location = ExecutionPlanUtilities.get_table_location("e")
e_1_csv_files = ExecutionPlanUtilities.get_csv_files(e_1_table_location)
e_1_file_index = 0
e_1_pos = 0

until e_1_file_index == e_1_csv_files.length

  e_1_line, e_1_file_index, e_1_pos = ExecutionPlanUtilities.read_record(e_1_table_location, e_1_csv_files, e_1_file_index, e_1_pos)
  record_1 = "" + e_1_line.chomp

    e_1_joined_flag = false
    d_0_table_location = ExecutionPlanUtilities.get_table_location("d")
    d_0_csv_files = ExecutionPlanUtilities.get_csv_files(d_0_table_location)
    d_0_file_index = 0
    d_0_pos = 0

    until d_0_file_index == d_0_csv_files.length

      d_0_line, d_0_file_index, d_0_pos = ExecutionPlanUtilities.read_record(d_0_table_location, d_0_csv_files, d_0_file_index, d_0_pos)
      record_0 = record_1 + "," + d_0_line.chomp

        d_0_joined_flag = false
            if e_1_line.split(",")[e_1_department_id_index].strip.to_i==d_0_line.split(",")[d_0_department_id_index].strip.to_i

        d_0_joined_flag = true

        records <<  record_0

    end


    end


      records << e_1_line.chomp + ("," * 3) if !e_1_joined_flag and join_type.start_with?("LEFT")

      records << (("," * 3) + e_1_line.chomp) if !e_1_joined_flag and join_type.start_with?("RIGHT")

end

d_department_name_index = ExecutionPlanUtilities::get_column_index("d", "department_name")

records.keep_if {|record| record.split(",")[4 + d_department_name_index]!="Support"}
aggregation_columns = []



if aggregation_columns.empty?

selection_columns << 0 + ExecutionPlanUtilities::get_column_index("e", "department_id")
selection_columns << 0 + ExecutionPlanUtilities::get_column_index("e", "employee_name")
selection_columns << 4 + ExecutionPlanUtilities::get_column_index("d", "department_name")

end
records.sort_by!{|record| [ ]}
unless selection_columns.empty?
records.map!{|record| record.split(",").values_at(*selection_columns).join(",")}
end

records.uniq! if false
  unless aggregation_columns.empty?

  mapper_file_name = MapReduce::Mapper.new.map(records, grouping_columns, aggregation_columns)

  shuffler_file_name = MapReduce::Shuffler.new(mapper_file_name).shuffle

  MapReduce::Reducer.new(shuffler_file_name, grouping_columns, aggregation_columns).reduce

  end

puts records

end

puts Time.now - start
