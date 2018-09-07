#!/usr/bin/env python

from datetime import datetime as dt
import dateutil.parser as p


def main():
    try:
        date = p.parse(input("Your date of birth: "))
    except ValueError:
        return "That's not a valid date!"

    today = dt.today()

    print(int((today - date).total_seconds()))


if __name__ == "__main__":
    main()
