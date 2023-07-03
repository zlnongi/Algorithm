# # 자료구조의 변경
# menu = {"커피", "우유", "주스"}
# print(menu)
# print(menu, type(menu))

# menu = list(menu)
# print(menu, type(menu))

# menu = set(menu)
# print(menu, type(menu))

# # (활용 예제)
# from random import *
# lst = [1,2,3,4,5]
# # print(lst)
# # shuffle(lst)
# # print(lst)
# print(sample(lst,1))

from random import *
users = range(1, 21) # 1부터 20까지 숫자를 생성
users = list(users) # list type으로 변경해주기

# shuffle(users)
# print(users)

winners = sample(users, 4) # 4명 중에서 1명은 치킨, 3명은 커피
print(" -- 당첨자 발표 -- ")
print("치킨 당첨자 : {0}".format(winners[0]))
print("커피 당첨자 : {0}".format(winners[1:]))
print(" -- 축하합니다 -- ")




