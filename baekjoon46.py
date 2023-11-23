# 10809번
import sys
import string

S = sys.stdin.readline().rstrip()

# 소문자 리스트 만들기
lower = [i for i in string.ascii_lowercase]

for i in range(len(lower)):
    if lower[i] in S:
        print(S.index(lower[i]))
    else:
        print("-1")