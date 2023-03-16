arr = []
# 5개를 입력받고 단어들 arr에 list형태로 저장
for _ in range(5):
    a = input()
    arr.append(a)
# 최대 len 단어 선택
MAX = max(len(w) for w in arr) 

for i in range(MAX):
    for j in range(5):
        if i < len(arr[j]):
            print(arr[j][i], end="")