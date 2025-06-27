/*let myPromise=new Promise(function(resolve,reject){
    let sucess = true//if false (rejected)
    if(sucess){
        resolve("the promise is resolved")
    }
    else{
        reject("the promise is rejected")
    }
})
myPromise.then(function(result){
    console.log(result)
}).catch(function(error){
    console.log(error)
}

)*/


// promise using asynchronous function
let myPromise = new  Promise(function(resolve){
    setTimeout(()=>
    {
        resolve("the data has been feached")
    }, 2000)//output after 10 sec
})
myPromise.then(function(message){
    console.log(message)
})

//spread operator

let arr=["A","B","C","D"]
console.log(arr)
console.log(...arr)

//cloning of an array using spread operator
let ARR1 = ["A", "B", "C", "D"];
console.log(...ARR1); // Outputs: A B C D

let arr2 = [...ARR1]; // Correct spread syntax to copy array
console.log(...arr2);    // Outputs: ["A", "B", "C", "D"]

//Array destructuring
//arrau:=storing the multiple values in a single variable.
//array destructuring:=this assings the value to the distinct variable
//individual variable
//eg: 
let arr3=["anu",23,"karnataka",767687687165]

const [a,b,c,d]=arr3
console.log(a)
console.log(b)
console.log(c)
console.log(d)