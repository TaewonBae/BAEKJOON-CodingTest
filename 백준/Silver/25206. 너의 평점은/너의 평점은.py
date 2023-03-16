rating = ['A+', 'A0', 'B+', 'B0', 'C+', 'C0', 'D+', 'D0', 'F']
grade = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0]

total = 0	# 학점 총합을 담을 변수
result = 0	# (학점 * 과목평점) 총합을 담을 변수
for _ in range(20) :
    # s: 과목명 p : 학점 g : 나의점수 (A+, A0 ,,)
    s, p, g = input().split() 
    p = float(p)
    if g != 'P' :	# 등급이 P인 과목은 계산 안함 : g가 'P'가 아닐경우만 계산
        total += p # 과목의 기준학점 추가
        result += p * grade[rating.index(g)] # 기준학점 * 점수(성적에 해당하는 인덱스번호를 가져와서 grade[index] 하면 됨)

print(format((result / total), ".6f"))