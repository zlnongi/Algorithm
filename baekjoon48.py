# 1152번
import sys

str = sys.stdin.readline().rstrip.split()
#print(str)
# rstrip 통해 뒤에 공백 제거, 그냥 strip()해도 될 듯
# 문자열.split() : 문자열을 일정한 규칙으로 잘라서 리스트로 만들어 주는 함수 
print(len(str))
