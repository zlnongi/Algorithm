# 표준 체중을 구하는 프로그램 만들기
# gender = input("당신의 성별은 무엇입니까?")
# height = 0

# def std_weight(height, gender):
#     if gender == "남자" or gender == "남":
#         height = float(input("당신의 키는 몇 cm입니까?"))
#        # weight = height*height*22
#         print("키 {0}cm 남자의 표준 체중은 {1}kg 입니다.".format(height, round((height/100)*(height/100)*22, 2)))
#         return height
#     else:
#         height = float(input("당신의 키는 몇 cm입니까?"))
#       #  weight = height*height*21
#         print("키 {0}cm 여자의 표준 체중은 {1}kg 입니다.".format(height, round((height/100)*(height/100)*21, 2)))
#         return height

# std_weight(height, gender)


gender = input("당신의 성별은 무엇입니까?")
height = 0

def std_weight(height, gender):
    if gender == "남자" or gender == "남":
        height = float(input("당신의 키는 몇 cm입니까?"))
        weight = round((height/100)*(height/100)*22, 2)
        print("키 {0}cm {1}의 표준 체중은 {2}kg 입니다.".format(height, gender, weight))
        return height
    else:
        height = float(input("당신의 키는 몇 cm입니까?"))
        weight = round((height/100)*(height/100)*21, 2)
        print("키 {0}cm {1}의 표준 체중은 {2}kg 입니다.".format(height, gender, weight))
        return height

std_weight(height, gender)