# 3009번
import sys
x_lst = []
y_lst = []

for _ in range(3):
    x, y = map(int, sys.stdin.readline().split())
    x_lst.append(x)
    y_lst.append(y)
# print(x_lst)   
# print(y_lst) 
    
for i in range(3):
    if x_lst.count(x_lst[i]) == 1:
        x1 = x_lst[i]
    if y_lst.count(y_lst[i]) == 1:
        y1 = y_lst[i]
print(x1, y1)