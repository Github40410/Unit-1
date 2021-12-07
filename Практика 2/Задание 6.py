# -- coding: utf-8 --
def asss():
    x1=int(input())
    x2=int(input())
    y1=int(input())
    y2=int(input())
    if ((x1%2==0)and(x2%2==0)) or ((x1%2!=0)and(x2%2!=0)):
        e=1
    else:
        e=0
    if ((y1%2==0)and(y2%2==0)) or ((y1%2!=0)and(y2%2!=0)):
        e2=1
    else:
        e2=0
    if e==e2:
        print("Да")
    else:
        print("Нет")
asss()