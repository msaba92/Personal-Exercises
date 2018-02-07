#!/usr/local/bin/ruby -w


def headtails
    coin = rand(0..1)
    if coin == 0
        puts "Heads!"
    elsif coin == 1
        puts "Tails!"
    end
end

def higherlower
    target = 100
    major = target
    minor = 0
    puts "Think of a number between 1 and 100."
    while true
        print "Is it #{target}? Y/H/L "
        answer = gets.chomp
        if answer.downcase == "y"
            puts "I did it!"
            break
        else
            if answer.downcase == "l"
                major = target
            elsif answer.downcase == "h"
                minor = target
            end
            targetarray = Array (minor..major)
            target = targetarray[targetarray.length / 2]
            if major == minor
                puts "Make up your mind!"
                break
            end
            if (major - minor == 1)
                puts "Make up your mind!"
                break
            end
        end
    end
end

while true
    print "Please select: 1 for coin flip, 2 for higher/lower. "
    choice = gets.chomp
    break if choice == "1" or choice == "2"
end

if choice == "1"
    headtails
else
    higherlower
end
