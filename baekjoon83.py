# 5073번
import sys

while True:
    A, B, C = map(int, sys.stdin.readline().split())
    if A == B == C == 0:
        break
    if max((A,B,C)) >= (sum((A,B,C))-max((A,B,C))):
        print("Invalid")
    elif A == B == C:
        print("Equilateral")
    elif (A==B) or (A==C) or (B==C):
        print("Isosceles")
    else: 
        print("Scalene")
    
    #(A != B != C & (max(lst) < (sum(lst)-max(lst)))):