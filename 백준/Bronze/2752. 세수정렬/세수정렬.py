import sys

a, b, c = map(int, sys.stdin.readline().split())

lst = []
lst.append(a)
lst.append(b)
lst.append(c)

lst.sort()

print(*lst)