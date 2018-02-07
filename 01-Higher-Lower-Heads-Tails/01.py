#!/usr/bin/env python3
import random


def headtails():
    coinresult = random.randint(0, 1)
    if coinresult == 0:
        print("Heads!")
    elif coinresult == 1:
        print("Tails!")


def higherlower():
    target = 100
    major = target
    minor = 1
    print("Think of a number between 1 and 100.")
    while True:
        answer = input("Is it %d? Y/H(igher)/L(ower) " % target)
        if answer.lower() == "y":
            print("I did it!")
            break
        else:
            if answer.lower() == "l":
                major = target
            elif answer.lower() == "h":
                if target == 100:
                    print("The number would be out of range!")
                else:
                    minor = target
            targetarray = range(minor, major)
            try:
                target = targetarray[int(len(targetarray)//2)]
            except IndexError:
                print("Make up your mind!")
                break
            if major == minor:
                print("Make up your mind!")
                break
            if (major - minor == 1) and (minor != 1):
                print("Make up your mind!")
                break


if __name__ == "__main__":
    while True:
        choice = input("Please select: 1 for coin flip, 2 for higher/lower. ")
        if choice == "1" or choice == "2":
            break
        else:
            print("No valid input.", end=" ")
    if choice == "1":
        headtails()
    elif choice == "2":
        higherlower()
