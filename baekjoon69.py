# 1193번
import sys

X = int(sys.stdin.readline())
line = 1

while X > line: # while문 탈출하면 X가 몇번째 대각선에 있는지 line에 저장됨
    X -= line
    line += 1
# print(X)
# print(line)

if line % 2 == 0:
    up = X
    down = line - X + 1
else:
    up = line - X + 1
    down = X

print(up, '/', down, sep="")
