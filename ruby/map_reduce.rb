gem 'parallel'
require 'json'
require 'parallel'
require 'stringio'
require_relative 'enumerable'

##
# This module implements MapReduce algorithms to be used in code generation for SQL compiler

module MapReduce

  DATA_TYPES_FILE_PATH = "C:\\Users\\ASUS\\Documents\\GitHub\\pl-sql-compiler\\output.json"
  MAPPER_RESULT_FILE = "mapper_result.txt"
  REDUCER_RESULT_FILE = "reducer_result.txt"
  SHUFFLER_RESULT_FILE = "shuffler_result.json"

  ##
  # This class maps every key (group by column)
  # with a corresponding value (value used inside aggregation functions)

  class Mapper

    def initialize

    end

    ##
    # If there are no grouping columns there is no need for a shuffler
    # Or call the shuffler otherwise
    #

    def map(records, grouping_columns, aggregation_columns)

      grouping_columns.empty? ? # No group by columns so no shuffler
          mapper_without_shuffling(records, aggregation_columns) :
          mapper_with_shuffling(records, grouping_columns, aggregation_columns) # Grouping columns exit so we need a shuffler

    end

    def mapper_without_shuffling(records, aggregation_columns)

      result_file = File.open(MapReduce::MAPPER_RESULT_FILE, "w")

      aggregation_columns.each do |entry|

        result_file.puts records.map {|record| record.split(",")[entry[:index]]}.join(",")

      end

      result_file.close

      MapReduce::MAPPER_RESULT_FILE

    end

    def mapper_with_shuffling(records, grouping_columns, aggregation_columns)

      result_file = File.open(MapReduce::MAPPER_RESULT_FILE, "w")

      records.each do |record|

        attributes = record.split(",")

        result_file.puts "#{attributes.values_at(*grouping_columns).join(",")}:#{attributes.values_at(*aggregation_columns.map {|column| column[:index].to_i}).join(",")}"

      end

      result_file.close

      MapReduce::MAPPER_RESULT_FILE

    end

  end

  ##
  # This class represents a shuffler which takes a mapper output (K,V) pairs
  # and creates lists that contain all values for a corresponding key
  # example: "key1":[v1,v2]
  #          "key2" : [v3,v5]

  class Shuffler


    def initialize(input_file_name)

      @input_file_name = input_file_name

    end

    def shuffle

      result_file = File.open(MapReduce::SHUFFLER_RESULT_FILE, "w")

      result_hash = {}

      File.foreach(@input_file_name) do |line|

        key_values = line.split(":")
        key = key_values[0]
        values = key_values[1]

        result_hash[key] = [] unless result_hash[key]

        values.split(",").each_with_index do |value, index|

          result_hash[key][index] = [] unless result_hash[key][index]

          result_hash[key][index] << value.chomp

        end

      end

      result_file.puts JSON.generate(result_hash)

      result_file.close

      MapReduce::SHUFFLER_RESULT_FILE

    end


  end

  ##
  # A reducer can take a shuffler or a mapper result
  # and reduces the list of each key to single value

  class Reducer

    def initialize(input_file, grouping_columns, aggregation_columns)

      @input_file = input_file
      @grouping_columns = grouping_columns
      @aggregation_columns = aggregation_columns

      puts grouping_columns.to_s
      puts aggregation_columns.to_s

    end

    def reduce

      @grouping_columns.empty? ? #No grouping functions so we are reducing without a previous shuffler
          reduce_without_shuffle :
          reduce_with_shuffle

    end

    def reduce_without_shuffle

      line_number = 0

      result_file = File.open(MapReduce::REDUCER_RESULT_FILE, "w")

      File.foreach(@input_file) do |line|

        values_array = line.split(",")

        values_array = map_array_by_type(values_array, line_number)

        result_file.puts case @aggregation_columns[line_number][:function]

                         when :SUM
                           values_array.sum.to_s

                         when :MAX
                           values_array.max.to_s

                         when :MIN
                           values_array.min.to_s

                         when :AVG
                           @aggregation_columns[index][:distinct] ?
                               values_array.uniq.avg.to_s :
                               values_array.avg.to_s

                         when :STDEV
                           @aggregation_columns[index][:distinct] ?
                               values_array.uniq.stdev.to_s :
                               values_array.stdev.to_s

                         when :VARIANCE
                           @aggregation_columns[index][:distinct] ?
                               values_array.uniq.variance.to_s :
                               values_array.variance.to_s

                         when :COUNT
                           if @aggregation_columns[index][:index] == -1
                             values_array.size.to_s
                           else
                             @aggregation_columns[index][:distinct] ?
                                 values_array.uniq.size.to_s :
                                 values_array.size {|value| !value.empty?}.to_s
                           end


                           line_number += 1

                         end
      end

      result_file.close

    end

    def reduce_with_shuffle


      input_hash = JSON.parse(File.read(@input_file))

      output_file = File.open(MapReduce::REDUCER_RESULT_FILE, "w")


      input_hash.each_key do |key|

        output_file.write key

        input_hash[key].each_with_index do |array_value, index|

          array_value = map_array_by_type(array_value, index)

          output_file.write "," + case @aggregation_columns[index][:function]

                                  when :SUM
                                    array_value.sum.to_s

                                  when :MAX
                                    array_value.max.to_s

                                  when :MIN
                                    array_value.min.to_s

                                  when :AVG
                                    @aggregation_columns[index][:distinct] ?
                                        array_value.uniq.avg.to_s :
                                        array_value.avg.to_s

                                  when :STDEV
                                    @aggregation_columns[index][:distinct] ?
                                        array_value.uniq.stdev.to_s :
                                        array_value.stdev.to_s

                                  when :VARIANCE
                                    @aggregation_columns[index][:distinct] ?
                                        array_value.uniq.variance.to_s :
                                        array_value.variance.to_s

                                  when :COUNT
                                    if @aggregation_columns[index][:index] == -1
                                      array_value.size.to_s
                                    else
                                      @aggregation_columns[index][:distinct] ?
                                          array_value.uniq.size.to_s :
                                          array_value.size {|value| !value.empty?}.to_s
                                    end


                                  end

        end

        output_file.puts

      end

      output_file.close

      MapReduce::REDUCER_RESULT_FILE

    end


    def map_array_by_type(array, index)

      case @aggregation_columns[index][:type]

      when :INT;
        array.map(&:to_i)
      when :FLOAT;
        array.map(&:to_f)
      else
        array
      end

    end


  end


end
