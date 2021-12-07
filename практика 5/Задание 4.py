# -- coding: utf-8 --
def sr():
  x=float(input("Введите первый результат: "))
  y=float(input("Введите нужный результат: "))
  d=1
  while x < y:
    x=x+(x/10)
    d+=1
  else:
    print(d)
sr()