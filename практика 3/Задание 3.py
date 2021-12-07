# -- coding: utf-8 --
def gg():
    A=int(input())
    B=int(input())
    if A>B:
        for i in range(A-1,B-1,-1):
            if i%2!=0:
                print(i)
    else:
        print("Нужно ввести другое число")
gg()