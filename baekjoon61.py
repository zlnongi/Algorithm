# 2566번
import sys

A = []
max_value = 0
row = 0 # 행
col = 0 # 열

for i in range(9): # N개의 줄 한 행!!씩 입력을 받으므로 행의 크기만큼 입력 반복
    A.append(list(map(int, sys.stdin.readline().rstrip().split())))
    #max_value = max(map(max,A))
    for j in range(9):
        if A[i][j] >= max_value:
            max_value = A[i][j]
            row = i+1
            col = j+1
print(max_value)
print(row, col)
    

          
          
