an = "Python's favorite food is perl"
print(type(an))

print("Your life is too short.\nYou need Python")

a = 3
b = 4

print(a*b) # 곱하기
print(a**b) # 제곱
print(a/b) # 그냥 나누기
print(a//b) # 몫
print(a%b) # 나머지

str1 = "Life is too short. You need Python"
print(str1[0:4])

str2 = "12345678"
print(str2[::2]) # 처음부터 끝까지 2칸 간격씩


number = 10
day = "three"
abc = "I ate %d apples, so I was sick for %s days." % (number, day)
print(abc)

str3 = "hello my age is {age} and my name is {name}".format(age=3, name="여진홍")
print(str3)

name = "int"
str4 = f"나의 이름은 {name}입니다"
print(str4)

str5 = "%0.4f" % 3.42134234  # 소수점 제한 넷째자리 까지
print(str5)


b = "hobby"
print(b.find('b')) # 있으면 index로 나옴 (제일 첫번째 인덱스)
print(b.find('x')) # 없으면 -1로 나옴

c = ",".join("abcd") # a,b,c,d
print(c)

cn = ",".join(["a", "b", "c"]) # join은 list 안에 많이 넣음
print(cn)

d = "Life is too short"
print(d.replace("Life", "Your leg")) # 교체됨
print(d.split(" "))

# 리스트 = 변수 여러 개를 묶는 역할
list1 = [1,2, "int", "김정현", ["김재원", "Manse samdori"]]
print(list1[4][1]) # list1의 4번째 인덱스의 1번째 인덱스

list2 = [1, 2, 3, 4, 5]
print(list2[0:3]) # [1, 2, 3] list2[이상:미만:간격]

list3 = ["박주하", "잠수", "문재성"]
del list3[0]
print(list3) # ['잠수', '문재성']

# 리스트 요소 추가 append
list3.append("시우버")
print(list3)

num3 = [1, 5, 3]
num3.sort() # 숫자 정렬 알파벳/한국어는 abc, 가나다 순
print(num3)

# 리스트 요소 삽입 insert
num4 = [1, 5, 3]
num4.insert(0,4) # 0번째 인덱스에 4를 추가해라
print(num4) # [4, 1, 5, 3]

# 리스트 확장 extend
list4 = [1, 5, 3, 1, 1]
list4.extend([2,3])
print(list4)
