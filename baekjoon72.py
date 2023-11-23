# 2501번
import sys

N, K = map(int, sys.stdin.readline().split())

index = 1
N_list =[]

while index <= N:
    if N % index == 0:
        N_list.append(index)
    index += 1
if len(N_list) < K:
    print("0")
else:
    print(N_list[K-1])



