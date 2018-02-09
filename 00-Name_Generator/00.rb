#!/usr/local/bin/ruby -w
require "open-uri"

firstname_list = open("https://raw.githubusercontent.com/dominictarr/random-name/master/first-names.txt")
lastname_list = open("https://raw.githubusercontent.com/dominictarr/random-name/master/first-names.txt")

fn = File.readlines(firstname_list)
ln = File.readlines(lastname_list)

print fn.sample.chomp + " " + ln.sample
