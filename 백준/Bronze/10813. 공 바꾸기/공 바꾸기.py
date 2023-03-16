# 바구니 N개, 바구니 1번~N번
# 바구니 각각 공1개
# 바구니 처음에는 바구니 번호 = 공 번호
# M번 공을 바꿀것
# 공을 바꿀 바구니 2개를 선택, 두 바구니 공 교환
n, m = map(int, input().split())
box = [i for i in range(1,n+1)] # 1~n까지 각 바구니안에 공 번호부여

for _ in range(m):
    i,j = map(int, input().split())
    temp = box[i-1]
    box[i-1] = box[j-1]
    box[j-1] = temp
    
for i in range(n):
    print(box[i], end=" ")