# -- coding: utf-8 --
age=int(input())
name=str(input())
if (age>0) and (age<75):
	if name != "Иван":
		if age >= 16:
			print("Поздравляем вы поступили в ВГУИТ")
		else:
			print("Сначало нужно окончить школу!")
			print("Вам осталось учиться", 16-age, "лет")
		