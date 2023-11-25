import sys
a, b = map(int, sys.stdin.readline().split())
c = int(sys.stdin.readline())
n0 = int(sys.stdin.readline())

if ((a*n0 + b <= c*n0)) and (a <=c):
    print(1)
else:
    print(0)