str1=str(input())
col=str1.count("h")
if col >= 2:
	s1=str1.find("h")
	s2=str1.rfind("h")
	g=str1[s1:s2+1]
	g2=g[::-1]
	print(str1.replace(g, g2))
else:
	pass