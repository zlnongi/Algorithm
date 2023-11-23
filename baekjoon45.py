# 11720번
import sys

N = int(sys.stdin.readline())

str = sys.stdin.readline().rstrip()
#num = int(sys.stdin.readline())

sum = 0
for i in range(N):
    sum += int(str[i]) # int로 변환해 주는 작업이 필요했음
print(sum)