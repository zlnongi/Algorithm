# 2581번
import sys

M = int(sys.stdin.readline())
N = int(sys.stdin.readline())
lst = []

for i in range(M, N+1):
        if i != 1:
            for j in range(2, i):
                if i % j == 0:
                    break
            else:
                lst.append(i)
if len(lst) > 0:
    print(sum(lst))
    print(min(lst))
else:
     print("-1")

