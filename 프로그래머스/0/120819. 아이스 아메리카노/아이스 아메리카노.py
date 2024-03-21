
def solution(money):
    answer = []
    answer.append(money//5500)
    answer.append(money%5500)
    return answer

print(solution(5500))
print(solution(15000))