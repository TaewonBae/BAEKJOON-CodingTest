# 1. 바구니 1번~N번 : N개, 각 바구니에는 공 1개씩 넣을 수 있음
# 2. M번 공 넣을 것, 한 번 공을 넣을때 공을 넣을 바구니 범위를 정하고, 같은 번호가 적혀있는 공을 넣을겨
# ex) [1, 3, 4] 입력시 1,2,3 번 바구니에 숫자 4가 적힌 공이 들어감(이미 있을 경우 새로운 4가 적용됨)
# 3. M번 공을 넣은 이후 각 바구니에 어떤 숫자가 들어있는지 출력
N, M = map(int, input().split()) 
arr = [0]*N # 배열 초기화
for _ in range(M):
    i,j,k = map(int, input().split())
    for idx in range(i,j+1):
        arr[idx-1]=k # >> 바구니 1번 = arr[0]
        
for i in range(N):
    print(arr[i], end=" ")