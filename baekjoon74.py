# 1978번
import sys

N = int(sys.stdin.readline())
N_list = list(map(int, sys.stdin.readline().split()))
cnt = 0 # 소수 여부 판별해서 소수인 경우 cnt+1

for i in N_list:
    if i != 1:
        for j in range(2, i):
            if i % j == 0:
                break # for j문 탈출
        else:
            cnt += 1

print(cnt)
