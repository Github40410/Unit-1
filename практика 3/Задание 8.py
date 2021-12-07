# -- coding: utf-8 --
def na():
    n=int(input("Введите натуральное число:"))
    if (n>0) and (n<=9):
        for i in range(1,n+1):
            for h in range(1,i+1):
                print(h, end="")
            print()
    else:
        print("Введите другое число!")
na()