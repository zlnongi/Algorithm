# 1157번
import sys

str = sys.stdin.readline().rstrip()
str1 = str.upper()

result ="" # 빈 문자열 만들기
arr = [0]*26

for i in str1:
    #ord(alphabet) : 알파벳을 아스키코드 값으로 변환 (a -> 97)
    arr[ord(i)-65] += 1

for i in range(len(arr)): # range(26)이라 해도 됨
    if arr[i] == max(arr):
        result += chr(i+65)
if len(result)>=2:
    print("?")
else:
    print(result)

