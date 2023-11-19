import sys
add = 0
h = []
for i in range(7):
    N = int(sys.stdin.readline())
    if N%2 !=0:
        h.append(N)
        add += N
        num = min(h)

if add == 0:
    print("-1")

else:
    print(add)
    print(num)