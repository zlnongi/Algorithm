# 2444번
import sys

N = int(sys.stdin.readline())

for i in range(1,N):
    print(' '*(N-i)+'*'*(2*i-1))
for i in range(N,0,-1): # 역순으로
    print(' '*(N-i)+'*'*(2*i-1))

    