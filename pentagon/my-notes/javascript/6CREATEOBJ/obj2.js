//how to add fun inside the js obj???????///

let persons={
    name:"anu",
    age:6,
    gender:"female",
    city:"bang",
play:function(){
    console.log(this.name+" is playing")
},
details:function(){
    console.log("i am",this.age,"years old")
console.log("i am from",this.city)
}
}
console.log(persons)
console.log(persons.gender)
persons.play()
persons.details()

//////////////////////////////////////////////////////////////////////////////////////////
//how to retive only the keys from obj???????????

//syntax
//object.keys(object_name)


let person={
    name:"anu",
    age:6,
    gender:"female",
    city:"bang",
play:function(){
    console.log(this.name+" is playing")
},
details:function(){
    console.log("i am",this.age,"years old")
console.log("i am from",this.city)
}
}
let key=Object.keys(person)
console.log(key)


//how to retrive only the valves from the obj
//syntax
//object.values(object_name)
let value=Object.values(person)
console.log(value)