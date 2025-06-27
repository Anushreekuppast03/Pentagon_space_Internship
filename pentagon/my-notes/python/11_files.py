words=["donckey","kaddu","mottu"]
with open ('read.txt') as f:
    content = f.read()

for word in words:

    content = content.replace(word,"$%^@$^#")
with open ("read.txt","w")as f:
    f.write(content)




import os

# Ensure the "tables" directory exists
os.makedirs("tables", exist_ok=True)

# Generate multiplication tables
for i in range(2, 21):
    with open(f"tables/multiplication_table_of_{i}.txt", 'w') as f:
        for j in range(1, 11):
            f.write(f"{i} x {j} = {i * j}\n")





def game():
    return 446448987654

score = game()
with open ("highscore.txt") as f:
    highscorestr= int(f.read())
if highscorestr=='':
     with open("highscore.txt","w")as f:
        f.write(str(score))


elif int(highscorestr)<score :
    with open("highscore.txt","w")as f:
        f.write(str(score))






f= open('read.txt')
t=f.read()
if 'hi' in t:
    print("hi is present")
else:
    print("hi not present")
f.close()




f= open('sample.txt','w')
f.write("i am appending\n")
f.write("I am reading")
f.close()



f= open('read.txt','r')
data= f.read()
#data = f.readall()
print(data)
f.close()

#don't need to write f.close it wiill do automaticaly
with open('sample.txt','r') as f:
    a=f.read()

with open('sample.txt','w') as f:
    a=f.write("me")
print(a)


#practice
