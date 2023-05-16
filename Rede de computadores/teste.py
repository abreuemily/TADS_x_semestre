a=[]
for i in range(1,11):
    x=int(input(f'{i}° número: '))
    a.append(x)
print(a)
print(len(a))
print(sum(a)/len(a))
print(list(reversed(a)))
print(max(a))
b=[]
for i in a:
    if i<0:
        b.append(i)
print(b)
