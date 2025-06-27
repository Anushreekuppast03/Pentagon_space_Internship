i=1
while i<=50:
    print(i)
    i=i+1



i=0
while i<=5:
    print("Anu")
    i=i+1


fruits=["bana","appa","grapes"]
i=0
while i<len(fruits):
    print(fruits[i])
    i=i+1


#...................for.............


fruits=["banana","applea","grapes"]
for item in fruits:
    print(item)



for i in range(1,8,2):
   print(i)




for i in range(10):
   print(i)
else:
    print("insidde else")



for i in range(0,10):
    print(i)
    if i==5:
        break


for i in range(0,10):
   
    if i==5:
        continue
    print(i)

#pass:null (do nothing)


i=4

def run(play):
    pass
def ouch(play):
    pass
if i>0:
    pass
while i>6:
    pass
print("ANU IS GOOD")




#practice set
n=3
for i in range(3):
    print(" "*(n-i-1),end="")
    print("*"*(2*i+1),end="")
    print(" "*(n-i-1))




n=4
for i in range(4):
    print("*"*(i+1))


numes = int(input("enter the numes"))
factorial=1
for i in range(1,numes+1):
    factorial=factorial*i
print(f"the fac {numes} is {factorial}")



nums = int(input("enter the nums"))
prime= True
for i in range(2,nums):
    if(nums%i==0):
        prime=False
        break
if prime:
    print("prime")
else:
    print("not prime")



num = int(input("enter the num"))
for i in range(1,10):
    print(str(num)+"x"+str(i)+"="+str(i*num))
    print(f"{num}X{i}={num*i}")



l1=["anu","sanu","janu","shree"]
for name in l1:
    if name.startswith("s"):
        print("hello"+name)



