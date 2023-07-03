# 함수
def open_account(): # 함수 설정
    print("새로운 계좌가 생성되었습니다.")

open_account() # 함수 호출 및 출력

# 전달값과 반환값
def deposit(balance, money): # 입금
    print("입금이 완료되었습니다. 잔액은 {0}원입니다.".format(balance + money))
    return balance + money

def withdraw(balance, money): # 출금
    if balance >= money: # 잔액이 출금보다 많으면
        print("출금이 완료되었습니다. 잔액은 {0}원입니다.".format(balance - money))
        return balance - money
    else:
        print("출금이 완료되지 않았습니다. 잔액은 {0}원입니다.".format(balance))

def withdraw_night(balance, money): # 저녁에 출금 수수료
    commission = 100 # 수수료 100원
    return commission, balance - money - commission # 여러 값 반환 가능


balance = 0 # 처음 잔액
balance = deposit(balance, 1000)
#balance = withdraw(balance, 500)
commission, balance = withdraw_night(balance, 500)
print("수수료는 {0}원이며, 잔액은 {1}원입니다.".format(commission, balance))

#print(balance)