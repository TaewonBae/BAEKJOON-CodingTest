N = int(input()) # 단어 몇개 입력 받을지
result = 0 
for _ in range(N):
    word = input() # 일단 string형으로 입력받아야됨
    if list(word) == sorted(word, key=word.find):
        result += 1
print(result)