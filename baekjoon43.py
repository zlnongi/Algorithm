# 9086번
import sys

T = int(sys.stdin.readline())

for _ in range(T):
    str = sys.stdin.readline().rstrip()
    print(str[0]+str[-1])

# T = int(input())

# for _ in range(T):
#     str = input()
#     print(str[0]+str[-1])