// spread operator

// ...object_name
// ...<array_name>

// it is used to copy properties of one object into another
// object and it is used to copy elements of one array
// into another array.

//example:applying spread operator for object
var obj1={
    name:"viart",
    age:35,
    city:"mumbai"
}
console.log(obj1)
var obj2={
    ...obj1,
    id:10,
    gender:"male",
    email:"virat@gmail.com"
}
console.log(obj2)

//example: applying spread operator for array
var arr=[10,20,30,40,50]
console.log(arr)
var arr1=[...arr,60,70,80,90]
console.log(arr1)