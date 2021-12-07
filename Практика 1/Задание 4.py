# -- coding: utf-8 --
seconds=int(input())
day=seconds//86400
ost=seconds%86400
hours=ost//3600
osta=ost%3600
minute=osta//60
sek=osta%60
print("Дней: ", day , "Часов: ", hours, "Минут: " , minute, "Секунд: ", sek)