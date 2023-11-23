# 2675번
import sys

T = int(sys.stdin.readline())

for _ in range(T):
    N, S = map(str, sys.stdin.readline().rstrip().split())
    
    for i in range(len(S)):
        print(S[i]*int(N), end="") # end역할: 공백 없애기 위함!!! AAA\n BBB\n CCC -> AAABBBCCC
    print("") # ABC 와 /HTP 줄 간격 생성 위해서 필요


