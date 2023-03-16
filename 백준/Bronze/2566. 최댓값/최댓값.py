import sys
input = sys.stdin.readline

board = [] #리스트 초기화
for _ in range(9):
    row = list(map(int, input().split()))
    board.append(row) # 행마다 추가해서 2차원배열 만듬
    
X,Y = 0,0 # 최댓값이  몇행 몇열(X행 Y열)인지
MAX = -1 # 최댓값
for i in range(9):
    for j in range(9):
        if board[i][j]>MAX:
            MAX = board[i][j]
            X = i+1
            Y = j+1
print(MAX) # 최댓값 출력
print(X, Y) # 최댓값 행렬 출력