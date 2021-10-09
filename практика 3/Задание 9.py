N=int(input())
summ=1
u=1
z=0
for i in range(3,N+1):
    u+=z
    summ+=u
    z=u-z
print(summ)