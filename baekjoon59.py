# 25206번
import sys

# score_list = []
# grade_list = []
# for i in range(3):
#     sub, score, grade = map(str, sys.stdin.readline().rstrip().split())
#     score_list += score # score list로 저장해줌
#     grade_list += grade # grade list로 저장해줌

#     score_ls = list(map(int,score_list)) # 
#     P_sum = 
#     score_sum = sum(score_ls) - sum()

#     for j in range():
#print(grade_list)
#print(sum(score_ls)) # 잘 더해지는 거 확인

#print(score_list)

# 딕셔너리 사용해보기 !!
dic = {'A+':4.5, 'A0':4.0, 'B+':3.5, 'B0':3.0, 'C+':2.5, 'C0':2.0, 'D+':1.5, 'D0':1.0, 'F':0.0}

score_sum = 0
grade_sum = 0
for _ in range(20):
    sub, score, grade = map(str, sys.stdin.readline().rstrip().split())
    score = float(score)
    if grade != 'P':
        score_sum += score
        grade_sum += score * dic[grade]
result = grade_sum / score_sum
print("%6f"%result)

