word = input().lower() # word = mississipi / baaa
word_list = list(set(word)) # word_list = ['m','i','s','p'] / ['b', 'a']
cnt = []
for i in word_list: # i =m,i,s,p / b,a
    count = word.count(i)
    cnt.append(count) #cnt = [4,4,1,1] / [1,3]

if cnt.count(max(cnt)) >=2: #max값이 2개 이상일경우
    print("?")
else:
    max_index = cnt.index(max(cnt)) # max index
    print(word_list[max_index].upper()) # max index 해당하는 값 대문자로 출력