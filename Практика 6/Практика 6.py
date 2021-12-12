# -- coding: utf-8 --

from tkinter import *
from tkinter import scrolledtext
def z1():
    w1= Tk()
    w1.title("Задание 1")
    w1.geometry("500x300")
    def z11():
        a=1
        n=int(N1.get())
        while a**2<n:
            d=a**2
            d=str(d)+" "
            g.insert(INSERT, d)
            a+=1
    s1=Label(w1, text="Введите число: ")
    s1.grid(column=0, row=0)
    N1=Entry(w1, width=10)
    N1.grid(column=1, row=0)
    btn1=Button(w1, text="Посчитать", command=z11)
    btn1.grid(column=2, row=0)
    g = scrolledtext.ScrolledText(w1, width=50, height=15)
    g.grid(column=0, row=1)
    w1.mainloop()
def z2():
    w2=Tk()
    w2.title("Задание 2")
    w2.geometry("500x300")
    def z22():
        s=1
        a=2
        n=int(N2.get())
        while s==1:
            if n%a != 0:
                a+=1
            else:
                d=str(a)+" "
                g2.insert(INSERT, d)
                break
           
    s2=Label(w2, text="Введите число: ")
    s2.grid(column=0, row=0)
    N2=Entry(w2, width=10)
    N2.grid(column=1, row=0)
    btn2=Button(w2, text="Посчитать", command=z22)
    btn2.grid(column=2, row=0)
    g2 = scrolledtext.ScrolledText(w2, width=50, height=15)
    g2.grid(column=0, row=1)
    w2.mainloop()
def z3():
    w3=Tk()
    w3.title("Задание 3")
    w3.geometry("500x300")
    def z33():
        st=1
        p=0
        n=int(N3.get())
        while st<n:
            st*=2
            p+=1
        else:
            st=int(st/2)
            p-=1
            p="Показатель степени: " + str(p) + "   "
            st="Степень: " + str(st)
            g3.insert(INSERT, p)
            g3.insert(INSERT, st)      
    s3=Label(w3, text="Введите число: ")
    s3.grid(column=0, row=0)
    N3=Entry(w3, width=10)
    N3.grid(column=1, row=0)
    btn3=Button(w3, text="Посчитать", command=z33)
    btn3.grid(column=2, row=0)
    g3 = scrolledtext.ScrolledText(w3, width=50, height=15)
    g3.grid(column=0, row=1)
    w3.mainloop()
def z4():
    w4=Tk()
    w4.title("Задание 4")
    w4.geometry("500x300")
    def z44():
        d=1
        x=int(N4.get())
        y=int(N41.get())
        while x<y:
            x=x+(x/10)
            d+=1
        else:
            g4.insert(INSERT, d)
    s4=Label(w4, text="Введите 1 и 2 значения: ")
    s4.grid(column=0, row=0)
    N4=Entry(w4, width=10)
    N4.grid(column=1, row=0)
    N41=Entry(w4, width=10)
    N41.grid(column=3, row=0)
    btn4=Button(w4, text="Посчитать", command=z44)
    btn4.grid(column=4, row=0)
    g4 = scrolledtext.ScrolledText(w4, width=50, height=15)
    g4.grid(column=0, row=1)
    w4.mainloop()
def z5():
    global a
    w5=Tk()
    w5.title("Задание 5")
    w5.geometry("500x300")
    a=0
    def z55(): 
        global a 
        x=int(N5.get())
        while x!=0:
            a+=1
            N5.delete(0, "end")
            break   
        else:
            a="Количество членов последовательности: " + str(a)
            g5.insert(INSERT, a)
    s5=Label(w5, text="Вводите число пока не появится результат: ")
    s5.grid(column=0, row=0)
    N5=Entry(w5, width=10)
    N5.grid(column=1, row=0)
    btn5=Button(w5, text="Посчитать", command=z55)
    btn5.grid(column=4, row=0)
    g5 = scrolledtext.ScrolledText(w5, width=50, height=15)
    g5.grid(column=0, row=1)
    w5.mainloop()
def z6():
    global n
    global d
    global a
    w6=Tk()
    w6.title("Задание 6")
    w6.geometry("500x300")
    n=0
    d=0
    def z66(): 
        global n
        global d
        global a
        a=int(N6.get())
        while a!=0:
            d+=1
            n+=a
            N6.delete(0, "end")
            break   
        else:
            a="Среднее значение: " + str(n/d)
            g6.insert(INSERT, a)
    s6=Label(w6, text="Введите число: ")
    s6.grid(column=0, row=0)
    N6=Entry(w6, width=10)
    N6.grid(column=1, row=0)
    btn6=Button(w6, text="Посчитать", command=z66)
    btn6.grid(column=4, row=0)
    g6 = scrolledtext.ScrolledText(w6, width=50, height=15)
    g6.grid(column=0, row=1)
    w6.mainloop()
def z7():
    global n
    global d
    global a
    w7=Tk()
    w7.title("Задание 7")
    w7.geometry("500x300")
    n=0
    d=0
    def z77(): 
        global n
        global d
        global a
        a=int(N7.get())
        while a!=0:
            if int(n)<int(a):
                if n==0:
                    n=a
                    N7.delete(0, "end")
                    break  
                else:
                    d+=1
                    n=a
                    N7.delete(0, "end")
                    break    
            else:
                a=str(d)
                g7.insert(INSERT, a)
    s7=Label(w7, text="Введите число: ")
    s7.grid(column=0, row=0)
    N7=Entry(w7, width=10)
    N7.grid(column=1, row=0)
    btn7=Button(w7, text="Посчитать", command=z77)
    btn7.grid(column=4, row=0)
    g7 = scrolledtext.ScrolledText(w7, width=50, height=15)
    g7.grid(column=0, row=1)
    w7.mainloop()
def z8():
    global n
    global d
    global a
    global x
    w8=Tk()
    w8.title("Задание 8")
    w8.geometry("500x300")
    n=0
    d=0
    x=0
    def z88(): 
        global n
        global d
        global a
        global x
        a=int(N8.get())
        while a!=0:
            if int(n)==int(a):
                d+=1
            else:
                n=a
                x=max(x,d)
                d=1
            N8.delete(0, "end")
            break  
        else:
            x=max(x,d)
            x=str(x)
            g8.insert(INSERT, x)
    s8=Label(w8, text="Введите число: ")
    s8.grid(column=0, row=0)
    N8=Entry(w8, width=10)
    N8.grid(column=1, row=0)
    btn8=Button(w8, text="Посчитать", command=z88)
    btn8.grid(column=4, row=0)
    g8 = scrolledtext.ScrolledText(w8, width=50, height=15)
    g8.grid(column=0, row=1)
    w8.mainloop()
wind = Tk()
wind.title("Добро пожаловать")
wind.geometry("500x300")
lbl=Label(wind, text="Выберите задание: ")
lbl.grid(column=0, row=0)
btn=Button(wind, text="Задание 1", bg="red", command=z1)
btn.grid(column=0, row=1)
btn2=Button(wind, text="Задание 2", bg="red", command=z2)
btn2.grid(column=0, row=2)
btn3=Button(wind, text="Задание 3", bg="red", command=z3)
btn3.grid(column=0, row=3)
btn4=Button(wind, text="Задание 4", bg="red", command=z4)
btn4.grid(column=0, row=4)
btn5=Button(wind, text="Задание 5", bg="red", command=z5)
btn5.grid(column=0, row=5)
btn6=Button(wind, text="Задание 6", bg="red", command=z6)
btn6.grid(column=0, row=6)
btn7=Button(wind, text="Задание 7", bg="red", command=z7)
btn7.grid(column=0, row=7)
btn8=Button(wind, text="Задание 8", bg="red", command=z8)
btn8.grid(column=0, row=8)
wind.mainloop()
