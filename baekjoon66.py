# 2720번
import sys

T = int(sys.stdin.readline())

for i in range(T):
    C = int(sys.stdin.readline())
    q = C//25
    q1 = C%25
    d = q1//10
    d1 = q1%10
    n = d1//5
    n1 = d1%5
    p = n1//1
    print(q, d, n, p, end="")
    print()
#print()

