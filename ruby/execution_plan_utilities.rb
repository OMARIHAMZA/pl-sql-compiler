module ExecutionPlanUtilities

  EXECUTION_PLAN_FILE_NAME = "execution_plan.txt"

  @counter = 0

  def self.get_table_location(table_name)

    @json_array = JSON.parse File.read(MapReduce::DATA_TYPES_FILE_PATH)
    @json_array.map do |entry|
      return entry["location"] if entry["name"].casecmp?(table_name)
    end
  end

  def self.get_csv_files(table_location)
    Dir.entries(table_location).select {|f| (!File.directory? f) && (File.extname(f).casecmp?(".csv"))}
  end

  def self.read_record(location, files, file_index, pos)

    line = nil

    File.open(location + "/" + files[file_index]) do |f|

      f.pos = pos

      line = f.readline

      pos = f.pos

      if f.eof?
        pos = 0
        file_index += 1
      end

    end

    return line, file_index, pos

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

    FileUtils.mkdir_p("C:\\Users\\ASUS\\Documents\\GitHub\\map-reduce-module\\" + table_alias)
    # Write the result to a temp csv file
    File.open(table_alias + "/" + table_alias + ".csv", "w") do |file|
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

      record_length = record.split(",").length

      if analytical_keys.empty?

        "#{record},#{File.read(MapReduce::REDUCER_RESULT_FILE)}"

      else

        "#{record},#{analytical_mapping[record.split(',').values_at(*analytical_keys).join(',')]}"

      end

    end

    [records, record_length]

  end

  def self.init_execution_plan_file

    File.delete(EXECUTION_PLAN_FILE_NAME)

  end

  def self.write_to_execution_plan(log)

    file = File.open(EXECUTION_PLAN_FILE_NAME, "a")

    file.puts (@counter += 1).to_s + " - " + log

    file.close

  end

end