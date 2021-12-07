# -- coding: utf-8 --
def gv():
  d=0
  n=0
  a=int(input("Введите число: "))
  while a != 0:
    if n < a:
      if n == 0:
        n = a
      else: 
        d+=1
        n=a
        a=int(input("Введите число: "))
  else:
    print(d)
gv()