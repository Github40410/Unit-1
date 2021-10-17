str1=str(input())
col=str1.count("h")
if col >= 2:
	s1=str1.find("h")
	s2=str1.rfind("h")
	print(str1.replace(str1[s1:s2+1],""))