# -- coding: utf-8 --
def sim():
    str1 = str(input())
    g=str1.find(" ")
    c1=str1[0:g]
    c2=str1[g+1::]
    print(c2,c1)
sim()