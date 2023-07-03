def profile(name, age, main_lang):
    print(name, age, main_lang)

profile("유재석", 20, "파이썬") # 자리대로 기본값

# 키워드값으로 호출
profile(name="유재석", main_lang="파이썬", age=20)
profile(main_lang="자바", age=25, name="여진홍")

# 가변인자
def profile1(name, age, lang1, lang2, lang3, lang4, lang5):
    print("이름: {0}\t나이: {1}\t".format(name,age), end =" ") # end 뒤에 적을 시 줄바꿈 하지 않고 한 칸만 띄움
    print(lang1, lang2, lang3, lang4, lang5)

profile1("유재석", 20, "Python", "Java", "C", "C++", "C#")
profile1("여진홍", 25, "Kotlin", "Swift", "", "", "")

# 위처럼 적으면 lang 많아질때마다 계속 추가해줘야함 불편하다 !!
# 이때 쓰는 것이 가변인자

# 가변인자 *language
def profile2(name, age, *language):
    print("이름: {0}\t나이: {1}\t".format(name, age), end=" ")
    for lang in language:
        print(lang, end=" ")
    print() # 줄바꿈 위해 넣은 것

profile2("유재석", 20, "Python", "Java", "C", "C++", "C#", "JavaScript")
profile2("여진홍", 25, "Kotlin", "Swift")
