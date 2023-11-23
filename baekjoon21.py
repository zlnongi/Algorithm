n = int(input())

sum = 0 # 초기화
for i in range(1,n+1): # 1에서 n까지
    sum += i
print(sum)

print(sum(range(1, int(input())+1))) # 한줄로도 쉽게 가능함