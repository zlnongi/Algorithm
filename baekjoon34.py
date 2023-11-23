# 2562번
import sys

N = list() # or N = []
for i in range(0,9):
   # N = list(map(int,sys.stdin.readline().split()))  --> 리스트에 뭘 추가할 때는 input 쓰지 X
    N.append(int(sys.stdin.readline()))
print(max(N))
print(N.index(max(N))+1)

