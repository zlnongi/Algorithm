# 지역변수 & 전역변수

gun = 10

def checkpoint(soldiers): #경계근무
    global gun # 전역 공간에 있는 gun 사용
    gun = gun - soldiers
    print("[함수 내] 남은 총 : {0}".format(gun))

# 가급적으로 함수의 전달값 parameter로 던져서 사용하는게 좋다
def checkpoint_ret(gun, soldiers):
    gun = gun - soldiers
    print("[함수 내] 남은 총 : {0}".format(gun))
    return gun # return함으로 인해 밖에서도 10에서 뺀 gun 수 사용가능


print("전체 총 : {0}".format(gun))
#checkpoint(2) # 2명이 경계 근무 나감
gun = checkpoint_ret(gun,2) # gun에 return된 값을 넣어주기 위해 필요 (함수 받음)
#checkpoint_ret(gun,2) -> 이렇게 하면 8이 return 되지 않는다 !!!!!
print("남은 총 : {0}".format(gun))