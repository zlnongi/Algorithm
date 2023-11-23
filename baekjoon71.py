# 5086
import sys

while True:
    X,Y = map(int,sys.stdin.readline().split())
    try:
        if Y % X == 0:
            print("factor")
            continue
        elif X % Y == 0:
            print("multiple")
            continue
        elif Y % X != 0 and X % Y != 0:
            print("neither")
            continue
    except ZeroDivisionError as e:
        if X == 0 and Y == 0:
            break
