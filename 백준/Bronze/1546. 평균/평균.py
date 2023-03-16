# 최댓값 M, 모든 점수를 점수/M*100
N = int(input()) # 시험 본 과목의 개수
score = list(map(int, input().split())) # 띄어쓰기로 구분된 여러개의 숫자 입력 값을 리스트에 입력
max_score = max(score) # 최댓값

for i in range(N):
    score[i] = score[i]/max_score*100
print(sum(score)/N)