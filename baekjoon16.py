H, M = map(int,input().split())

if (45 <= M <= 59):
    print(H,M-45)
elif (1 <= H <= 23) and (0 <= M <= 44):
    print(H-1,60+M-45)
else:
    print(24+H-1, 60+M-45)