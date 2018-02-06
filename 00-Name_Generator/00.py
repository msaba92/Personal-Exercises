#!/usr/bin/env python

import requests
from random import choice

namelist = ((requests.get('https://raw.githubusercontent.com/dominictarr/random-name/master/first-names.txt')).content).split(b"\r\n")
surnamelist = ((requests.get('https://raw.githubusercontent.com/dominictarr/random-name/master/names.txt')).content).splitlines()

print(str(choice(namelist), "UTF8"), str(choice(surnamelist), "UTF8"))
