# 2563번
import sys

N = int(sys.stdin.readline())
arr = [[0]*100 for _ in range(100)]

for _ in range(N):
    x, y = map(int,sys.stdin.readline().split())
    for i in range(x,x+10):
        for j in range(y,y+10):
            arr[i][j] = 1

ans = 0
for i in arr: 
    ans += i.count(1)

print(ans)