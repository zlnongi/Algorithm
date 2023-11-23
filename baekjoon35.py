# 10810
import sys

N, M = map(int, sys.stdin.readline().split())
basket = [0 for _ in range(N)]

for _ in range(M):
    i, j, k = map(int, sys.stdin.readline().split())

    for idx in range(i,j+1):
        basket[idx-1] = k

for n in range(N):
    print(basket[n], end=" ")

        




