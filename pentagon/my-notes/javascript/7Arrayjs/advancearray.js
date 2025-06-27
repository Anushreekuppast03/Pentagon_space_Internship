//1.forEach()
//if we want to access each and every element an array 
//we are using forEach()
//it will not return any value
//it will not alter original array

var arr = ["raj",100,"anu",true,"a",76.09]
 let arr4=arr.forEach((ele,index)=>{
console.log(ele+ " " +index)

})


    let arr1 = [
        {name: "raj", id: 101},
        {name: "virat", id: 102},
        {name: "riya", id: 103},
        {name: "sachin", id: 104}
    ];
    
    let arr6 = arr1.forEach((ele, index) => {
        console.log(ele ," " , index);
    });
    

    //2.MAP
    //SHOULD BE RETURN SOME VALUE
    // RETURNED VALVE  always added in a new array 
    // it will not alter original array

    var aa= [10,20,30,40]
    let ass= aa.map((ele,index)=>{
return ele*2
    })
    console.log(ass)


    var ani=["virat","raj","anu","sanu"]
    let ass1= ani.map((ele,index)=>{
        return ele+"$"
            })
            console.log(ass1)


/////3.filter
//it is used to filter  elements data from the array based on certain condition 
//it will not alter original array
//filter call back fun will return always return bollean value 
//it will create new array

var jh=[101,109,988,564,234,112]
let jj=jh.filter((ele,index)=>{
return ele>200;
})
console.log(jj)
////////////////////////
var anui=[{name:"alice",isactive:true,score:82},
    {name:"bob",isactive:false,score:90},
    {name:"charli",isactive:true,score:65},
    {name:"diaa",isactive:true,score:78},
]
let jjii=anui.filter((ele,index)=>{
    return ele.score>75 && ele.isactive==true;
    })
    console.log(jjii)

//////
let ar = [
    {name: "notebook", price: 50,quantity:2},
    {name: "pen", price: 10,quantity:5},
    {name: "backpack", price: 103,quantity:1}
    
];
//foreach-eg
let arr8 = ar.forEach((ele, index) => {
    console.log(ele ," " , index);
});
//.............
//map eg
var an=["Aarav","kruthika","nihal","divya"]
    let ass10= an.map((ele,index)=>{
        return "Hello, "+ele+"!"
            })
            console.log(ass10)

///4.reduce ()

//it is used to reduce the array to one single value ,it is such a metod which accept a call back fun
//functiom as a parameter (first para)
//(second param) initial value
//syntax:reduce(calback,initial value)

/*let sanu=[10,20,30,40,50]
let calback=(prev,current)=>{//0+10=10,10+20=30,30+30=60,60+40=100,100+50=150
    return prev+current
}
let ressy=sanu.reduce(calback,0)//0,10,20
console.log(ressy)*/

//sort
///it is used to sort the array either a accending or decending order 

var name=["anu","sanu","janu","manu","tanu"]
console.log(name)
console.log(name.sort())


//how to sort an array accendig or decending order

 var mmmm1=[10,2,5,6,7]
 let vvxc=mmmm1.sort((a,b)=>{
 return a-b
 })
console.log(vvxc)

//decending
var mmmm12=[10,2,5,6,7]
let vvxc1=mmmm12.sort((a,b)=>{
return b-a
})
console.log(vvxc1)


//
let sanu1 = [
    { name: "shirt", price: 1200 },
    { name: "jeans", price: 2500 },
    { name: "shoes", price: 3000 },
    { name: "watch", price: 1500 }
];

let ressy1 = sanu1.reduce((prev, curr) => {
    return prev + curr.price;
}, 0);

console.log("Total cart price: " + ressy1);

//sort
let manu = [
    { name: "shirt", price: 1200 },
    { name: "jeans", price: 2500 },
    { name: "shoes", price: 3000 },
    { name: "watch", price: 1500 }
];

let vvx1 = manu.sort((a, b) => {
    return b.price - a.price;
});

console.log(vvx1);
