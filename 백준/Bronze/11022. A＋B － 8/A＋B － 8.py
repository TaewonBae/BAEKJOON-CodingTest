t = int(input())

for i in range(1, t+1):  # 1부터 t까지
    a, b = map(int, input().split()) # 두 수는 공백을 사이에 두고서 한 줄로 입력받기 때문에 input( ). split( ) 함수로 입력받자마자 공백을 기준으로 나누어주었다.
    print(f"Case #{i}: {a} + {b} = {a+b}")#f-string은 문자열도 원하는 모양으로 작성할 수 있고 { } 괄호를 이용해서 변수를 입력할 수도 있어서 정말 간편하다. 