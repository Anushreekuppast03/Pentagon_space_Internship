print("a")

c= '''hi
bye"anu'''
print(c)


name="anu"
add="kuppast"
print(name +"   "+ add)
 
stu = "mangala"
#print(stu[1:5])
print (stu[1:-4])

s= stu[1:4:2]
print(s)

hf=stu[0::2]
print(hf)

story="there was a youtube called with jam"
print(len(story))
print(story.endswith("jam"))
print(story.count("a"))
print(story.capitalize())
print(story.find("was"))
print(story.replace("jam","Anu"))
 

st="my name \n is \t anu"
print(st)

nams=input("enterv ur name\n")
print("gm"+nams)

letter='''dear <|na|>
  u are selectedmanu
  
  date:<|date|>'''
name=input("enter name")
date=input("enter date")
letter=letter.replace("<|na|>,na")
letter=letter.replace("<|date|>,date")
print(letter)
