# 입력 받을 전체 금액 : x
# 물건 종류의 수 : N
# N개의 줄에는 각 물건의 가격 a, 개수 b 가 주어진다.
x = int(input())
sum = 0

for _ in range(int(input())):
    a, b = map(int, input().split())
    sum += a * b

print("Yes") if sum == x else print("No")