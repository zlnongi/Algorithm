# 10807번
import sys

N = int(sys.stdin.readline())
#lst = [0 for _ in range(N)]
lst = list(map(int, sys.stdin.readline().split()))
v = int(sys.stdin.readline())
print(lst.count(v))

#print(lst)
# for i in lst:
#      print(i, end=' ')