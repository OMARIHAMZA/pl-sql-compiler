module ExecutionPlanUtilities


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

end