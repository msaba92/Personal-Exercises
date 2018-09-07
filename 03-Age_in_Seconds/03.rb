#!/usr/bin/env ruby

require 'date'

birth = gets.chomp
begin
    parsed = Date.parse(birth)
rescue
    puts "Not a valid date! Please insert a date in the form YYYY/MM/DD or DD/MM/YYYY."
end

diff = (Date.today - parsed) * 60 * 60 * 24
puts diff.to_i
