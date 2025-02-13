import sys
N, M = map(int, sys.stdin.readline().split()) # 데이터 개수, 줄의 개수
lst = list(map(int, sys.stdin.readline().split()))
prefix_sum = [0] 
temp = 0

for i in lst:
    temp += i
    prefix_sum.append(temp) # 합배열 만들기

for i in range(M):
    a, b = map(int, sys.stdin.readline().split())
    print(prefix_sum[b]-prefix_sum[a-1])