# 3003번
import sys

result = list(map(int, sys.stdin.readline().split()))
chess = [1, 1, 2, 2, 2, 8]

#print(chess - result)
# print(chess + result)는 쉽게 되나 빼기는 쉽게 되지 않는다.
for i in range(len(result)):
    print(chess[i]-result[i], end=" ")
