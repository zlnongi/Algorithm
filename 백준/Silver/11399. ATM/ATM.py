import sys

N = int(sys.stdin.readline()) # 사람 수
P = list(map(int, sys.stdin.readline().split()))
num = 0

P.sort()

N_list = []
for i in range(len(P)+1):
    num = sum(P[:i])
    N_list.append(num)
    #print(N_list)
    sum1 = sum(N_list)

print(sum1)