module ExecutionPlanUtilities


  FILES_PARENT = "C:\\Users\\Asus\\Documents\\Github\\pl-sql-compiler\\ruby\\"

  EXECUTION_PLAN_FILE_NAME = FILES_PARENT + "\\execution_plan.txt"

  @counter = 0

  def self.get_table_location(table_name)

    @json_array = JSON.parse File.read(MapReduce::DATA_TYPES_FILE_PATH)
    @json_array.map do |entry|
      return entry["location"], entry["field_terminator"] if entry["name"].casecmp?(table_name)
    end
  end

  def self.get_csv_files(table_location, table_name = "")

    csv_files = Dir.entries(table_location).select {|f| (!File.directory? f) && (File.extname(f).casecmp?(".csv"))}

    ExecutionPlanUtilities::write_to_execution_plan("Fetch row from table #{table_name} into memory") if csv_files.size > 0 && !table_name.empty?

    csv_files

  end

  def self.read_record(location, files, file_index, pos, field_terminator)

    line = ""

    File.open(location + "/" + files[file_index]) do |f|

      f.pos = pos

      line = f.readline

      pos = f.pos

      if f.eof?
        pos = 0
        file_index += 1
      end

    end

    return line.gsub(/#{field_terminator}/, ","), file_index, pos

  end

  def self.get_column_index(table_name, column_name)
    @json_array = JSON.parse File.read(MapReduce::DATA_TYPES_FILE_PATH)
    @json_array.each do |entry|
      if entry["name"].casecmp?(table_name)
        entry["members"].each_with_index do |member, member_index|
          return member_index if member["name"].casecmp?(column_name)
        end
        break
      end
    end
  end

  def self.get_table_members(table_name)
    json_array = JSON.parse File.read(MapReduce::DATA_TYPES_FILE_PATH)

    json_array.map do |entry|
      if entry["name"].casecmp?(table_name)
        return entry["members"]
      end
    end

    []
  end

  def self.process_subselect_statement(records, table_alias, members)

    FileUtils.mkdir_p("C:\\Users\\ASUS\\Documents\\GitHub\\pl-sql-compiler\\ruby\\" + table_alias)
    # Write the result to a temp csv file
    File.open("C:\\Users\\ASUS\\Documents\\GitHub\\pl-sql-compiler\\ruby\\" + table_alias + "/" + table_alias + ".csv", "w") do |file|
      file.puts records
    end

  end

  def self.process_analytic_function(records, analytical_keys, analytical_aggregation_column)

    analytical_aggregation_columns = [analytical_aggregation_column]

    mapper_file_name = MapReduce::Mapper.new.map(records, analytical_keys, analytical_aggregation_columns)

    shuffler_file_name = ""

    shuffler_file_name = MapReduce::Shuffler.new(mapper_file_name).shuffle unless analytical_keys.empty?

    analytical_mapping = MapReduce::Reducer.new(analytical_keys.empty? ? mapper_file_name : shuffler_file_name, analytical_keys, analytical_aggregation_columns, "").reduce

    record_length = 0

    records = records.map do |record|

      record_length = (record.split(",").length > record_length) ? record.split(",").length : record_length

      if analytical_keys.empty?

        "#{record},#{File.read(MapReduce::REDUCER_RESULT_FILE)}"

      else

        "#{record},#{analytical_mapping[record.split(',').values_at(*analytical_keys).join(',')]}"

      end

    end

    [records, record_length]

  end

  def self.init_execution_plan_file

    File.delete(EXECUTION_PLAN_FILE_NAME) if File.exist?(EXECUTION_PLAN_FILE_NAME)

  end

  def self.write_to_execution_plan(log)

    file = File.open(EXECUTION_PLAN_FILE_NAME, "a")

    file.puts (@counter += 1).to_s + " - " + log

    file.close

  end

  def self.write_query_to_file(records, query_counter)

    FileUtils.mkdir_p(FILES_PARENT + query_counter.to_s + "_query")

    file = File.open(FILES_PARENT + query_counter.to_s + "_query/query.csv", "w")

    file.puts records

    file.close

  end

  def self.delete_query_files(query_counter)

    query_counter.downto(0).each do |current_counter|

      FileUtils.rm_rf(FILES_PARENT + current_counter.to_s + "_query")

    end

  end

  def self.add_temp_data_type(name, members, query_counter)

    temp_data_type = {}

    temp_data_type["is_temp"] = true
    temp_data_type["members"] = members
    temp_data_type["name"] = name
    temp_data_type["location"] = FILES_PARENT + query_counter.to_s

    data_types = JSON.parse(File.read(MapReduce::DATA_TYPES_FILE_PATH))

    data_types << temp_data_type

    data_types_file = File.open(MapReduce::DATA_TYPES_FILE_PATH, "w")

    data_types_file.puts data_types.to_json

    data_types_file.close

  end

end