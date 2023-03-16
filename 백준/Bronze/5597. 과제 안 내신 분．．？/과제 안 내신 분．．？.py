student = [i for i in range(1,31)] # student = [1,2,3,,,,30]

for _ in range(28):
    num = int(input())
    student.remove(num)
    
print(min(student))
print(max(student))
