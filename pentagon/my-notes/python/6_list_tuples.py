a=[1,8,8,0,8]

#print(a[2])

a[3]=65
print(a)


c=[45,"anu",98.0,False]
print(c)


#list slicing
frd=["nanu","anu","sanu","janu"]
print(frd[1:3])
print(frd[-3:])

l1=[1,2,4,65,76]
l1.sort()  #l1.reverse  #l1.append(45) add at the end   #l1.insert(2,34)insert 34 at index 2
#l1.pop(2)   #l1.remove(2)
print(l1)



#  tuples  immutable

t=(1,3,7,9)
#print(t[0])
# print(t)

# print(t.count(1))
print(t.index(3))


t1=input(" enter the fruit 1" )
t2=input("enter the fruit  2"  )
t3=input("enter the fruit 3" )
t4=input("enter the fruit 4" )

myfruit = [t1,t2,t3,t4]
print(myfruit)

s={20,20.0,"20"}
print(s)
print(len(s))

