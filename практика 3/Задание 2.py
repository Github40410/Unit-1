# -- coding: utf-8 --
def ss():
    A=int(input())
    B=int(input())
    if A<B:
        for i in range(A,B+1):
            print(i)
    if A>B:
        for i in range(A,B-1,-1):
            print(i)
ss()     