"# -- coding: utf-8 --"
def gv():
  d=0
  n=0
  a=int(input("Введите число: "))
  while a != 0:
    d+=1
    n+=a
    a=int(input("Введите число: "))
  else:
    print("Среднее значение: ", n/d)
gv()