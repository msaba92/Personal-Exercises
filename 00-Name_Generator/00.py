#!/usr/bin/env python

import requests
from random import choice

name_url = "https://raw.githubusercontent.com/"\
           "dominictarr/random-name/master/first-names.txt"
surname_list = "https://raw.githubusercontent.com/"\
               "dominictarr/random-name/master/names.txt"

namelist = ((requests.get(name_url)).content).split(b"\r\n")
surnamelist = ((requests.get(surname_list)).content).splitlines()

print(str(choice(namelist), "UTF8"),
      str(choice(surnamelist), "UTF8"))
