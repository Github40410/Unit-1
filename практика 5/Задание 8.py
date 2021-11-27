"# -- coding: utf-8 --"
def gg():
  d=0
  n=0
  x=0
  a=int(input("Введите число: "))
  while a != 0:
    if n == a:
      d+=1
    else:
      n=a
      x=max(x,d)
      d=1
    a=int(input("Введите число: "))
  else:
    x=max(x,d)
    print(x)
  
gg()