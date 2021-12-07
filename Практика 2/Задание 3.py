# -- coding: utf-8 --
n=int(input())
hours=n//60
minute=n%60
if hours>=24:
    z=hours%24
    print("Часов: ", z, "Минут: ",minute)
else:
    print("Часов: ", hours, "Минут: ", minute)