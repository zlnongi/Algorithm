# while
customer = "토르"
index = 5

while index >= 1:
    print("{0}, 커피가 준비되었습니다. {1}번 남았어요".format(customer, index))
    index -= 1
    if index ==0:
        print("커피는 폐기처분 되었습니다.")


# customer2 = "아이언맨"
# index = 0

# while True:
#     print("{0}, 커피가 준비되었습니다. 호출 {1}회".format(customer2, index))
#     index += 1

# command c 누르면 무한루프 꺼짐

customer3 = "토르"
person = "Unknown"

while person != customer3:
    print("{0}, 커피가 준비되었습니다.".format(customer3))
    person = input("이름이 어떻게 되세요?")
# 토르를 입력해야 while문 탈출 

