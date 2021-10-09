N=int(input())
K=int(input())
summ=0
u=1
z=0
if (K<N) and (K>0):
    if K<3:
        summ=1
        for i in range(3,N+1):
            u+=z
            summ+=u
            z=u-z
        print(summ)
    else:
        for i in range(3,N+1):
            if i>=K:
                u+=z
                summ+=u
                z=u-z
            else:
                u+=z
                z=u-z
        print(summ)
else:
    print("Введите другие числа")