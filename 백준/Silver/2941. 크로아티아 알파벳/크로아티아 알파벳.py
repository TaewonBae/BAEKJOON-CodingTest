a = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
b = input() # b = ljes=njak
for i in a: # b = aeaaaa
    b = b.replace(i, 'a')
print(len(b))