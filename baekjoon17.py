A, B = map(int,input().split())
C = int(input())

hour = (B+C)//60 # 몫이므로 (30+20)//60= 0 이렇게 더함
min = (B+C)%60 # 나머지

if (B+C >= 60):
    if (A+hour >= 24): # 24시간 넘어갈 경우 24시간 빼줘서 0부터 시작하게 만들어줌
        A = A-24
    A = A + hour # 뺴준 값에다 다시 hour 더해주기
    print(A, min)

else: # B+C < 60
    if(A >= 24):
        A = A-24
    print(A, B+C)

