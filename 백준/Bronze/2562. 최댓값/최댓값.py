n_list = []
for i in range(9):
    n_list.append(int(input()))
print(max(n_list)) # 최댓값
print(n_list.index(max(n_list))+1) # 몇번째 인덱스인지 (index()+1)