# 2738번
import sys

N, M = map(int,sys.stdin.readline().split()) # 행렬의 크기
A = [] # 행렬 받을 리스트 A,B 선언
B = []

for i in range(N): # N개의 줄 한 행!!씩 입력을 받으므로 행의 크기만큼 입력 반복
    A.append(list(map(int, sys.stdin.readline().rstrip().split())))

for i in range(N):
    B.append(list(map(int, sys.stdin.readline().rstrip().split())))

for i in range(N):
    for j in range(M):
        print(A[i][j] + B[i][j], end=" ")
    print() # 줄바꿈 해줘서 행 구분하기

