//1..push
//when we need to push any data to an array
//we use push method,push(),always append the data to the last index of the array

/*let arr=[]
arr.push("virat")
arr.push(10)
arr.push(true)
arr.push({age:23,city:"hvr"})
console.log(arr)*/

//2.pop
//when we need to remove the element/data from the last index of the array we need to use pop() method

/*let arr1=[10,"anu",true,{name:"janu"},false]
console.log(arr1)
arr1.pop()
arr1.pop()
console.log(arr1)*/

//3.unshift()
//when we need to push the data /element in the beginning index of an array (push)

/*let arr2=[10,"anu",true,{name:"janu"},false]
console.log(arr2)
arr2.unshift("sanu")
arr2.unshift(76)
console.log(arr2)
*/

//4.shift 
//to remove the element from the beginig index of an array we need to use shift method (pop)
/*let arr2=[10,"anu",true,{name:"janu"},false]
console.log()
arr2.shift()
arr2.shift()
console.log(arr2)*/

//5.indexof()
//is used to find the index value of particular element 
//if the ellement is not available inside the array
//then the indexof() will return -1 as the o/p

/*let arr2=[10,"anu",true,{name:"janu"},false]
console.log(arr2.indexOf(false))
console.log(arr2.indexOf("ab"))*/


//6.join
//whenever we need to join all the elements inside the array join method should be used 
//join method will join all the method of the array and return it to the string format
//we can join specia;l character to each array element


/*let arr2=[10,"anu",true,false]
console.log(arr2)
console.log(arr2.join())
console.log(arr2.join(" "))
console.log(arr2.join("$"))*/

//7.includes
//it includes check wether the data pased to it is present or not
//if present it return true if not it will return false 

/*let arr2=[10,"anu",true,false]
console.log(arr2.includes("anu"))
console.log(arr2.includes("janu"))*/


//8.reverse
//in order to reverse an array we use reverse method

/*let arr2=[10,"anu",true,false]
console.log(arr2)
console.log(arr2.reverse())
*/

//9.slice
//whenever we need to extract particular element from the array we can use slice
// it will not alter the original array

// syntsx: slice (start index) or
//slice(staet,end index)

/*let arr2=[10,20,30,40,50,60,70]
//30,40,50,60,70
console.log(arr2.slice(2))
//30,40
console.log(arr2.slice(2,4))
//20,30,
console.log(arr2.slice(1,3))*/

//10,splice
//  syntax splice(start index,length)
//extraction start from at the start index extracts the length number of eklements from array


let arr2=[10,20,30,40,50,60,70,80,90]

console.log("orriginal array before splice"+arr2)
let splicearray=arr2.splice(3,5)
console.log("splicearray"+splicearray)
console.log("orriginal array splice"+arr2)