// normal arrow fun
let fun = ()=>{
console.log("i am arrow fun")
}
fun()

//para arrow fun
let fun1 = (x,y)=>{
    console.log(x*y)
    }
    fun1(12,2)

//return arrow fun
let fun3 = ()=>{
    return "anu"
   
}
    console.log( fun3())
    // without return
    let sum=()=>console.log(10+20)
    sum()


    //arrow fun as a callback
   function fun5 (f){
    f()}
    fun5(()=>{
        console.log("i am arrow fun")
    })
       
      //arr fun as par and return
      let res=(x,y)=>{
        return x+y      }
        console.log(res (20,30))
//or
let res1=(x,y)=>
     x+y      
    console.log(res1 (29,30))