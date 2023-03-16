arr = [] # 먼저 숫자를 저장할 리스트 arr를 설정해준다
for i in range(10):
    num = int(input())
    arr.append(num%42)

arr=set(arr) # 리스트는 중복을 허용한다. 따라서 set()이라는 함수를 사용하여 중복을 없애준다, but 정렬은 제멋대로 된다
print(len(arr)) # 요소 개수 센다고 .count사용하면 안된다........count는 원하는 특정 문자를 셀 때 활용!