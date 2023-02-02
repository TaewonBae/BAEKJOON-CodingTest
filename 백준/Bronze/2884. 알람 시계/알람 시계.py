# 바로 "45분 일찍 알람 설정하기"이다.

H, M = map(int, input().split())
if M>44: # 45분 이상일 경우
    print(H,M-45)
elif H>0 and M<45: # 1시 이후, 00분<45분
    print(H-1,M+15)
else:        # 0시, 00분<45분
    print(23,M+15)