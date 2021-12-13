# -- coding: utf-8 --
def vus():
    ear=int(input())
    if ((ear%100!=0) and (ear%4==0)) or (ear%400==0):
        print("Да")
    else:
        print("Нет")
vus()