# 5597번
import sys

students = list(range(1,31))
#print(students)
n = list()
for _ in range(1,29):
    n.append(int(sys.stdin.readline()))
    #print(n)
    
for i in students:
    if i not in n:
        print(i)

# 와 나랑 다르게 푼 사람들이 대부분이네.. 더 공부하자