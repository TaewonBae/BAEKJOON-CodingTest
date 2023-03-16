N = int(input()) # 첫째 줄에 정수의 개수 N 주어짐
N_list = list(map(int, input().split())) # 둘째 줄에는 N개의 정수를  공백으로 구분해서 주어짐
print(min(N_list), max(N_list))