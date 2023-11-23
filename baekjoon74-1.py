# 내가 생각했던 방식 !!
import sys

N = int(sys.stdin.readline())
lst = list(map(int, sys.stdin.readline().split()))

cnt = 0

for i in lst:
    if i != 1:
        N_list = []
        for j in range(1,i+1):
            if i % j == 0:
                N_list.append(j) # 약수의 개수 저장해주기
        if len(N_list) == 2:
            cnt += 1
print(cnt)
