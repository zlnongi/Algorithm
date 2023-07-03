# import sys
# print("Python", "Java", file=sys.stdout) # 표준 출력
# print("Python", "Java", file=sys.stderr) # 표준 에러

# 시험 성적
scores = {"수학":0, "영어":50, "코딩":100} # 딕셔너리
for subject, score in scores.items(): #itmes -> key & value 페어로 나오게 됨
   # print(subject, score)
   print(subject.ljust(8), str(score).rjust(4), sep=":") 
   # ljust -> 왼쪽 정렬 8칸 확보
   # rjust -> 오른쪽 정렬 4칸 확보

# 은행 대기 순번표
# 001, 002, 003...
for num in range(1, 21):
   print("대기번호 : " + str(num).zfill(3)) # 3 크기만큼 크기 확보 + 빈공간은 0으로 채우기

# 표준입력 -> 기본 input 무조건 문자열 형태로 저장됨
answer = input("아무 값이나 입력하세요 : ")
print("입력하신 값은 " + answer + " 입니다.")
