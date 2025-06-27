
// fake store API
async function fetchdata() {
   let response=await fetch("https://fakestoreapi.com/products/1")
//console.log(response)
let data=await response.json()
console.log(data)
}
fetchdata()

//json placeholder fake Api -user
let fetchResult=async ()=> {
    let response=await fetch("https://jsonplaceholder.typicode.com/users")
 //console.log(response)
 let data=await response.json()
 console.log(data)
 }
 fetchResult()

 //json placeholder fake Api -comment

 let fetchComment= async function () {
    let response=await fetch("https://jsonplaceholder.typicode.com/comments")
 let data=await response.json()
 console.log(data)
 }
 fetchComment()

