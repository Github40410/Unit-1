# -- coding: utf-8 --
def scv():
    x=int(input())
    y=int(input())
    z=int(input())
    if (x<y) and (x<z):
        print(x)
    if (y<x) and (y<z):
        print(y)
    if (z<x) and (z<y):
        print(z)
scv()