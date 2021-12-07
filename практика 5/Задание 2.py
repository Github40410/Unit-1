# -- coding: utf-8 --
def dd():
  s=1
  a=2
  N=int(input("Введите число:"))
  while s == 1:
    if N%a != 0:
      a+=1
    else:
      print(a)
      break
dd()