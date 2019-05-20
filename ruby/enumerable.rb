##
# Extend the enumerable module with avg,variance,and standard deviation

module Enumerable

  def avg
    self.sum / self.length.to_f
  end

  alias_method :mean, :avg

  def variance
    m = self.avg
    sum = self.inject(0) {|accum, i| accum +(i - m) ** 2}
    sum / (self.length - 1).to_f
  end

  def stdev
    Math.sqrt(self.variance)
  end

  def median
    sorted = self.sort_by &Proc.new
    len = sorted.length
    (sorted[(len - 1) / 2] + sorted[len / 2]) / 2.0
  end

  alias_method :q2, :median

  def mode
    hash = Hash.new(0)
    self.each do |i|
      hash[i]+=1
    end
    hash.max_by{|k,v| v}[0]
  end

  def q3
    sorted = self.sort_by &Proc.new
    sorted[((sorted.count + sorted.size / 2) / 2)]
  end

end