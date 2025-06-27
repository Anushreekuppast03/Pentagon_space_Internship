class Number:
    def sum(self):
        return self.a+self.b
num=Number()
num.a=12
num.b=34
a=12
b=34
print("the sum of a and b is",a+b)




class RailwayForm:
    formType="RailwayForm()"

    def printData(self):
        print(f"Name is{self.name}")

anuApplication=RailwayForm()
anuApplication.name="Anu"
anuApplication.printData()