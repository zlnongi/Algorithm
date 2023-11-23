# 10101번
import sys
a_lst = []
a1 = ""
for _ in range(3):
    a = int(sys.stdin.readline())
    a_lst.append(a)
#print(a_lst)
if a_lst[0] == a_lst[1] == a_lst[2] == 60:
    print("Equilateral")
elif (a_lst[0] == a_lst[1] or a_lst[0] == a_lst[2] or a_lst[1] == a_lst[2]) and (a_lst[0]+a_lst[1]+a_lst[2])==180:
    print("Isosceles")
elif (a_lst[0] != a_lst[1] != a_lst[2] ) and (a_lst[0] + a_lst[1] + a_lst[2])== 180:
    print("Scalene")
else:
    print("Error")