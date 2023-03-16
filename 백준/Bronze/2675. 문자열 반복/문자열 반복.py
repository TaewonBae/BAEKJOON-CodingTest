t = int(input()) # 테스트 케이스 갯수
for _ in range(t):
    text=''
    num, s = input().split() # 단어 s, 각 글자 몇번 반복할지 num
    for i in s:
        text += int(num)*i
    print(text)
