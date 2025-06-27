//4. Anonymons function
let fun=function(){
    console.log("i am anonymous")
}
fun()
  // parameterized anonumous function
  let add=function(a,b){
    let c=a+b
    console.log(c)
  }
  var details=function(name,age,city){
    console.log(name)
    console.log(age)
    console.log(city)
  }
  details('virat',30,'delhi')

  //retturned anonymous function
  let res=function(){
    return "welcome"
  }
  let r=res()
  console.log(r)
  //anonymous parameterized return function
  let sum=function(a,b,c){
    let d=a+b+c
    return d
  }
  console.log(sum(10,20,30))