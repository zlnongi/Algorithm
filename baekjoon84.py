# 14215번
import sys
lst = []
a, b, c = map(int, sys.stdin.readline().split())
lst = [a, b, c]
lst.sort()

if lst[0] + lst[1] > lst[2]:
    print(sum(lst))
else:
    print((lst[0]+lst[1])*2 - 1)


