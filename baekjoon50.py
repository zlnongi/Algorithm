# 5622번
import sys

str = sys.stdin.readline().rstrip()
upper = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']

sum = 0
for i in range(len(str)):
    for j in upper:
       if str[i] in j:
           sum += upper.index(j)+3
print(sum)