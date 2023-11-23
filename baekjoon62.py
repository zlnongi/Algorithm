# 10798번
import sys

A = []

for i in range(5):
    A.append(list(map(str,sys.stdin.readline().rstrip())))

for i in range(15):
    for j in range(5):
        if i < len(A[j]):
            print(A[j][i], end="")

        
# new_A = [i[1] for i in A]
