# 2941번
import sys

str = sys.stdin.readline().rstrip()
# str1 = str.replace("dz=","d").replace("c=","č").replace("c-","ć").replace("d-","đ").replace("lj","l").replace("nj","n").replace("s=","š").replace("z=","ž")
# print(str1)

croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in croatia:
    str = str.replace(i,"*")
print(len(str))