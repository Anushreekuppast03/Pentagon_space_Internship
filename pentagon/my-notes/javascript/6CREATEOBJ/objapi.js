async function fetchdata(){
    let response=await fetch('https://fakestoreapi.com/products/1')
     let data=await response.json()
     //console.log(data)
     //console.log(data.title)
     //console.log(data.category)
     //console.log(data.rating.rate)
     data.color='red'
     data.stock=true
     //console.log(data)
     data.title='laptop'
     data.color='black'
     //console.log(data)
     delete data.description
     delete data.image
     //console.log(data)
     return data
 
 }
 let res=fetchdata()
 console.log(res)