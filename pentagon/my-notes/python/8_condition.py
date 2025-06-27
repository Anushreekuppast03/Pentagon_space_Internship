
names=["anu","janu","sanu"]
name=input("enter the name")
if name in names:
    print("is there")
else:
    print("not there")



text = input("enter text\n")

if("make a lot of money" in text):
    spam=True
elif("buy now" in text):
    spam=True
elif("click this" in text):
    spam=True
else:

    spam=False
if (spam):
    print("text:spam")
else:
    print("text:false")




a=25
if(a>3):
    print("the value of a is greater than 3")
elif(a>7):
    print("> than 7")
elif(a>17):
    print("> than 17")
else:
    print("not than 3 or 7")








sub1 = int(input("enter sum1\n"))
sub2 = int(input("enter sum2\n"))
sub3 = int(input("enter sum3\n"))
if(sub1<33 or sub2<33 or sub3<33):
    print("fail")
if(sub1+sub2+sub3)/3<40:
    print( "u fail due to total %")
else:
    print("congratulation")




num1 = int(input("enter num1\n"))
num2 = int(input("enter num2\n"))
if(num1>num2):
    print("num1")
else:
    print("f2=num2")


ages=45
if(ages>34 or ages<56):
    print("u can not work")
#both t =t and else false

a= None
if(a is None):
    print("yes")
else:
    print("no")


b=[34,886,98]
print(34 in b)



age= int(input("enter ur age"))
if age>=18:
    print("yes")
else:
    print("no")