# 2292번
import sys
N = int(sys.stdin.readline())
bee = 1
cnt = 1

while N > bee:
    bee += 6*cnt
    cnt += 1

print(cnt)