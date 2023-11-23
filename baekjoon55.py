# 10988번
import sys

str = sys.stdin.readline().rstrip()
#print(str[::-1])
if str == (str[::-1]):
    print("1")
else:
    print("0")
