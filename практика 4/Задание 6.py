str1=str(input())
col=str1.count("f")
if col == 0:
	print(-2)
if col == 1:
	print(-1)
if col > 1:
	g=str1.find("f")
	print(str1.find("f",g+1))