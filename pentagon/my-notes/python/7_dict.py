#dict: collection of key value pair
#change




mydict={
    "fast":"sloe",
    "run":"walk",
    "mark":[8.7,0],
    "auto":{'anu':"kuppast"},
    3:9
}
print(mydict.keys())
print(type(mydict.keys()))
print(mydict["fast"])
print(mydict["auto"]['anu'])
print(mydict)
updatedict ={"manu":"anu",
             "nb":"jh"}
mydict.update(updatedict)
print(mydict)
print(mydict.get("run"))

a={}
print(type(a))
b=set()
print(type(b))
b.add(6)
b.add(8)
print(len(b))
b.remove(8)
print(b.pop())
print(b)

mydi={"aa":"fef","sa":"sfsf"}
a=input("enter the wor")
print("the word",mydi[a])
print("the word",mydi.get(a))
num1=int(input("enter num 1\n"))
num2= int(input("ent num2"))
s={num1,num2}
print(s)

