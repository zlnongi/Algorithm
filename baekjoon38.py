# 3052번
import sys
k = list()
for _ in range(1,11):
    n = int(sys.stdin.readline())
    k.append(n%42)
    #print(k)
print(len(set(k)))

    