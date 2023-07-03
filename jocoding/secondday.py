# 리스트와 튜플
# 리스트는 [대괄호] 튜플은 (소괄호)
# 리스트는 변경 가능, 튜플은 수정 불가능 -> 고정된 것
t1 = (1,2,'a','b')
#del t1[0] # 불가능 슬라이싱은 리스트와 같다

# 딕셔너리 중요 !!!!!!!
# 연관 배열 (Associative array) 또는 해시 (Hash)
# Key를 통해 Value를 얻는다
# 앞이 Key 뒤가 Value
dic = {'name': 'Eric', 'age': 15}
print(dic['name'])

a = {1: 'a'}
a['name'] = "익명"

del a[1]

print(a)

b = {1: '파랑구름', 2: '이현준', 3:'민준'}
print(b.keys()) # Key만 뽑기 >> dict_keys([1,2,3])
print(b.values()) # values만
print(b.items) # (key,value) 쌍으로 뽑을 때

# b.clear() # 모두 지우기

print(b.get(4,'없음')) # 바라는 키가 없을 때 none 나옴

print(1 in b) # TRUE 불 형식으로 나옴

# 집합 자료형 >> 아마 파이썬에만 있을 걸?
# 중복 허용 X , 순서 X

s1 = set([1,2,3]) # 집합 set
s1 = {1,2,3} # set과 똑같음
print(s1)

# 집합 언제 사용하나요?
l = [1,2,2,3,3]
newList = list(set(1)) # 집합으로 만들어서 중복된 것 다 제외한 후 다시 list로 변경

print(newList)


s1 = set([1,2,3,4,5,6])
s2 = set([4,5,6,7,8,9])
# 교집합
print(s1&s2)
print(s1.intersection(s2))

# 합집합
print(s1 | s2)
print(s1.union(s2))

# 차집합
print(s1-s2)
print(s2.difference(s1))

# 집합에 요소 하나 추가
s1.add(7)
print(s1)

# 집합에 여러 요소 추가
s1.update(7,8,9)
print(s1)



