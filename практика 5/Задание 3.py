"# -- coding: utf-8 --"
def ad():
  N=int(input("Введите число: "))
  st=1
  p=0
  while st < N:
    st*=2
    p+=1
  else:
    st=int(st/2)
    p-=1
    print("Показатель степени: ", p)
    print("Степень: ", st)
ad()