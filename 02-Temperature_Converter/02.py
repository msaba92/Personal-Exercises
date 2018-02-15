#!/usr/bin/env python


def convert(temp, unit):
    if unit == "c":
        c = temp
        f = 9.0/5.0 * c + 32
        k = c + 237.15
    elif unit == "f":
        f = temp
        c = (f - 32) / 9.0 * 5.0
        k = c + 237.15
    elif unit == "k":
        k = temp
        c = temp - 273.15
        f = 9.0/5.0 * c + 32

    f = ("%f" % f).rstrip("0").rstrip(".")
    c = ("%f" % c).rstrip("0").rstrip(".")
    k = ("%f" % k).rstrip("0").rstrip(".")
    return "F: %s\nC: %s\nK: %s" % (f, c, k)


if __name__ == "__main__":
    unit = input("Enter the unit of measure (k, c or f): ").lower()
    accepted = ["k", "c", "f"]
    if unit not in accepted:
        print("Your entered unit was not valid!")
    else:
        try:
            temp = float(input("Enter the temperature you wish to convert: "))
            print(convert(temp, unit))
        except ValueError:
            print("This temperature is not valid! It must be a number.")
