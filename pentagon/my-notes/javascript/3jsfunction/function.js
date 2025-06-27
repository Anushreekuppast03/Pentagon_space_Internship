//1.named function
function playing(){
    console.log("virat is playing")
}
playing()
playing()

function add(){
    var a=10,b=20
    let c=a+b
    console.log(c)
}
add()

// Parameterized function

function add1(a,b){
    let c=a+b
    console.log(c)
}
add1(10,30)


function details(name,age,city){
    console.log("my name is",name)
    console.log("i am "+age,"year old")
    console.log("i am form ",city)
}
details("virat",37,"mumbai")
details("sachin",49)
details()


//3. Returned function
     //named return function
     function fun(){
        return 'i am return function'
     }
     let a=fun()
     console.log(a)

     function sum(){
        var a=10
        return a+30
     }
     let b=sum()
     console.log(b)

     function fun1(){
        let isplaced=true
        return isplaced
        console.log(isplaced)// not executed
     }
     let c=fun1()
     console.log(c)

     //paramterized return function
     function sub(a,b){
        let res=a-b
        return res
     }
     let d=sub(50,40)
     console.log(d)

     function detl(name,age ,gender){
        console.log("name is",name)
        console.log(age)
        return gender
     }
     let e=detl("virat",30,'male')
     console.log(e)


