# 11718번
#import sys

# for _ in range(2):
#     str = sys.stdin.readline().strip()

while True:
    try:
        print(input())
    except EOFError:
        break

# 이렇게 하면 왜 출력초과가 뜨지??? -> readline()은 개행문자를 포함해서 받아서 인듯 하다. 
# 근데 strip 썼는데도 왜 안 되는 걸까? rstrip 써도 안 됨.. 왜인지 모르겠다 ㅠㅠ

# 파이썬이 eof 처리 : try except 사용 -> while문에서 사용한다
# EOF : 입력이 끝날 때까지 출력
