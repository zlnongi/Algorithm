# 1546번
import sys

N = int(sys.stdin.readline())
score = list(map(int,sys.stdin.readline().split()))

M = max(score)
# 리스트 일괄 수정
for i in range(len(score)):
    score[i] = score[i]/M*100
    avg = sum(score)/len(score)
print(avg)
