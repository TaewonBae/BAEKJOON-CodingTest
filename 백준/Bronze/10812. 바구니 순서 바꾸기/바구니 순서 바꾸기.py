N,M = map(int, input().split()) # 바구니 갯수 입력
box = [i+1 for i in range(N)] # 각 바구니 번호 부여
# [0,1,2,std,4,5,6] >> [std,4,5,6,0,1,2]   # i~j 기준 k
for _ in range(M):
    i,j,k = map(int,input().split())
    box = box[:i-1]+box[k-1:j]+box[i-1:k-1]+box[j:]      # 처음~i-1까지+ k-1 ~ j까지 + i-1 ~ k-1까지 + j~끝 
for x in box:
    print(x, end=" ")