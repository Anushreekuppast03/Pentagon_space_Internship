
#fun:perform specific fun

marks=[23,45,43,22]
per1=(sum(marks)/400)*100

marks2=[24,98,79,89]
per2=(sum(marks2)/400)*100
print(per1,per2)
print("hi")




def per(marks):
    p=((marks[0]+marks[1]+marks[2]+marks[3])/400)*100
    return p
marks=[23,45,43,22]
per1=per(marks)

marks2=[24,56,76,87]
per2=per(marks2)
print(per1,per2)




def greet(name):
    print("good day",name)
greet("anu")


def greet(name):
    print("good day",name)
def mysum(num1,num2):
    return num1+num2
greet("sanu")
s= mysum(6,32)
print(s)


def greet(name):
    greet="hi\t"+name
    return greet
a=greet("janu")
print(a)


def greet(name="stranger"):
    print("good day",name)
greet("manu")
greet()




#recursion


def factorial_inter(n):
    product=1
    for i in range(n):
        product = product*(i+1)
    return product 
def factorial_recursive(n):
    if n==1 or n==0:
        return 1
    return n*factorial_recursive(n-1)
f=factorial_recursive(3)
print(f)


def factorial(i):
    if i==0 or i==1:
        return 1
    else:
        return i*factorial(i-1)
    

#practise

def max(num1,num2,num3):
    if(num1>num2):
        if(num1>num3):
            return num1
        else: 
            return num3
    else:
        if(num2>num3):
            return num2
        else:
            return num3
        
m = max(3,4,556)
print("the value of the max\t"+str(m))



def far(cel):
    return(cel*(9/5))+32
c=0
f=far(c)
print("fahreheit temp is\t"+str(f))



print ("Hi",end="")
print("hello",end="")


n=6
for i in range(n):
    print("*"*(n-i))

def remove_and_split(string,word):
    newStr =string(this,"Anu")
    return newStr.strip()
this="    hi anu  how are u  "
n=remove_and_split(this,"Anu")

