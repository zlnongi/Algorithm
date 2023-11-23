# 10811번
import sys

N, M = map(int, sys.stdin.readline().split())
basket = list(range(1,N+1)) # N까지 순서대로 list 안에 넣기

for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    reversed_basket = basket[i-1:j] # 이걸 [i-1:j:-1]로 하면 reverse 계산 안됨...
    reversed_basket.reverse()
    basket[i-1:j] = reversed_basket

for i in range(N):
    print(basket[i], end=" ")






