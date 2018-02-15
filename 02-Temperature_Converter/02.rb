#!/usr/local/bin/ruby -w

def convert(temp, unit)
    if unit == "c"
        c = temp
        f = 9.0/5.0 * c + 32
        k = c + 237.15
    elsif unit == "f"
        f = temp
        c = (f - 32) / 9.0 * 5.0
        k = c + 237.15
    elsif unit == "k"
        k = temp
        c = temp - 273.15
        f = 9.0/5.0 * c + 32
    end
    puts "F: #{f.round(4)}\nC: #{c.round(4)}\nK: #{k.round(4)}"
    puts "All temperatures are rounded to the fourth decimal at most."
end

def main
    print "Enter the unit of measure (k, c or f): "
    unit = gets.chomp.downcase
    accepted = ["k", "c", "f"]
    if not accepted.include?(unit)
        puts "Your entered unit was not valid!"
    else
        print "Enter the temperature you wish to convert: "
        temp = gets.chomp
        begin
            temp = Float(temp)
            convert(temp, unit)
        rescue ArgumentError
            puts "Your temperature is not valid! It must be a number."
        end
    end
end

main
