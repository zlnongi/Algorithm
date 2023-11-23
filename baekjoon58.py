# 1316번
import sys

N = int(sys.stdin.readline())
cnt = N # 글자 들어간 수

for i in range(N):
    str = sys.stdin.readline().rstrip()
    for j in range(len(str)-1):
        if str[j] == str[j+1]: # 연속된 글자가 나오면 continue
            continue
        elif str[j] in str[j+1:]: # 그 이후 글자가 같은 글자가 나오면 그룹 단어가 아님
            cnt -= 1
            break
print(cnt)




    