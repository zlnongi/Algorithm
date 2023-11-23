# 2908번
import sys

A, B= map(str, sys.stdin.readline().rstrip().split())

if (int(A[2]+A[1]+A[0])) < (int(B[2]+B[1]+B[0])):
    print(B[2]+B[1]+B[0])
else:
    print(A[2]+A[1]+A[0])