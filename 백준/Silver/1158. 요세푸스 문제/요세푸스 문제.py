import sys
from collections import deque

N, K = map(int, sys.stdin.readline().split())
queue = deque()
result = []

for i in range(1, N+1):
    queue.append(i)
# queue 안에 1 2 3 4 5 6 7

while queue:
    for i in range(K-1): # K=3 이니까 index 0 1 사라지게 하기
        queue.append(queue.popleft()) # 1 2 빠진거 뒤에 append
    result.append(queue.popleft())

print("<", end="") # end 넣어서 줄바꿈 X
print(", ".join(map(str,result)) + ">")