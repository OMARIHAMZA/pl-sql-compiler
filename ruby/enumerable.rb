##
# Extend the enumerable module with avg,variance,and standard deviation

module Enumerable

  def avg
    self.sum / self.length.to_f
  end

  def variance
    m = self.avg
    sum = self.inject(0) {|accum, i| accum +(i - m) ** 2}
    sum / (self.length - 1).to_f
  end

  def stdev
    Math.sqrt(self.variance)
  end

end