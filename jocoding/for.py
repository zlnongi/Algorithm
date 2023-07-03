# for
# print("대기번호 : 1")

# for waiting_no in [0,1,2,3,4]:
#     print("대기번호: {0}".format(waiting_no))


for waiting_no in range(5): # 0,1,2,3,4 까지 범위가 주어짐
    print("대기번호: {0}".format(waiting_no))

# range 범위를 1부터 시작하고 싶으면 ??
for waiting in range(1,6): # 1,2,3,4,5
    print("대기번호: {0}".format(waiting))


starbucks = ["아이언맨", "토르", "아이엠 그루트"]
for customer in starbucks:
    print("{0}, 커피가 준비되었습니다.".format(customer))

