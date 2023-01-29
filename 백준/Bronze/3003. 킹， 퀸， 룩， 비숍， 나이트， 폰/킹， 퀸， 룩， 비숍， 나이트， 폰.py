chess = [1,1,2,2,2,8] # 정해진 말의 수
chess2 = list(map(int, input().split())) # 입력 받은 말의 수
for i in range(6):
    print(chess[i]-chess2[i], end=' ')