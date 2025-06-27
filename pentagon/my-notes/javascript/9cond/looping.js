for(var i=0;i<5;i++){
    console.log("the i val is"+i)
}

//while loop
 let count=0
 while(count<10){
    console.log("the count value is" + " "+count)
    count++
 }

 //do while
 var counter=0
 do{
    console.log("the count value is" + " "+counter)
    counter++

 }
 while(counter<8);

 //for each
 let person={
   name:"anu",
   age:32,
   gender:"f",
city:"hvr"
 }
 for(var x in person){
   console.log(x)//only keys
console.log(person[x])//only values
 }

 //for of loop

 let arr90=[10,23,34,56,78,90]
 for (var datass of arr90){
   console.log(datass)
 } 
 //in;index  and  of:element

 