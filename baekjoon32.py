# 10871번
import sys

N, X = map(int, sys.stdin.readline().split())
A = list(map(int,sys.stdin.readline().split()))

# for문으로 다시 풀어봐라!!
for i in range(N):
    if A[i] < X:
        print(A[i], end=" ")