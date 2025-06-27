// 5.call back function
 /*function print(){
    console.log("welcome to js class")
 }
 function fun(f){
    console.log(f)
    //f()
 }
 fun(print())
 function add(x,y){
    let z=x+y
    console.log(z)
 }
 fun(add(10,20))

 // passing anoynomous function
 function fun1(f,name){
    console.log(name)
    f()
 }
 fun1(function(){
    console.log("i am anoynomus")
 },"sachin")
*/
 //call back anonymous parameterised function

 function fun3(f,name){
    console.log(name)
 }
let add1=function(a,b){
    let z=a+b
    console.log(z)
}
fun3(add1(10,20),"manasa")

// callback anonymous return function

function fun4(f,name){
    console.log(f)
    console.log(name)

}
function sub(){
    return "bhavana"
}
fun4(sub(),"mamata")

// call bacl anonymous parameteised return function
function fun5(f,name){
    console.log(f)
    console.log(name)
}
function mul(a,b){
    let c=a*b
    return c
}
fun5(mul(10,20),"vidya")