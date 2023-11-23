# 11005번
import sys
N, B = map(int, sys.stdin.readline().split())

digits = ("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
res = "" # 빈 문자열 생성

if 2 <= B <= 36:
    while N>0:
        N, r = divmod(N, B)
        res = digits[r] + res

print(res)