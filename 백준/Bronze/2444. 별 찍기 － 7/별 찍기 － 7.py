N = int(input()) # 몇개 찍을지 int형으로 받음, 2*N-1 번째 줄 까지 별을 출력
for i in range(1,N):
    print(' '*(N-i) + '*'*(2*i-1))
for i in range(N,0,-1):
    print(' '*(N-i) + '*'*(2*i-1))