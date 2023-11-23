# 2869번
import sys

A, B, V = map(int, sys.stdin.readline().split())

a = (V-B)/(A-B)

if int(a) == a:
    print(int(a))
else:
    print(int(a)+1)
