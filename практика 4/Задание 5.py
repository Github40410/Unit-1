# -- coding: utf-8 --
def nm():
    str1=str(input())
    col=str1.count("f")
    if col == 1:
        print(str1.find("f"))
    if col > 1:
        print(str1.find("f"), str1.rfind("f"))
    if col == 0:
        pass 
nm()	
	