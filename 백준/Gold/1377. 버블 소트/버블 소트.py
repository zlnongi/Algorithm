# 버블 정렬 프로그램1
import sys

N = int(sys.stdin.readline())
A = []

for i in range(N):
    A.append((int(sys.stdin.readline()),i))

A.sort()
#print(A)

Max = 0

for i in range(N):
    if Max < A[i][1] - i:
        Max = A[i][1] - i

print(Max + 1)