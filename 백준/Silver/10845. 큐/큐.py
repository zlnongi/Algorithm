import sys
from collections import deque

N = int(sys.stdin.readline())
queue = deque()

for i in range(N):
    A = sys.stdin.readline().split() # push 1 이런식으로 여러 개 넣으므로

    if A[0] == "push":
        queue.append(A[1])
    elif A[0] == "pop":
        if not queue:
            print("-1")
        else:
            print(queue.popleft())
    elif A[0] == "size":
        print(len(queue))
    elif A[0] == "empty":
        if not queue:
            print("1")
        else:
            print("0")
    elif A[0] == "front":
        if not queue:
            print("-1")
        else:
            print(queue[0])
    elif A[0] == "back":
        if not queue:
            print("-1")
        else:
            print(queue[-1])  