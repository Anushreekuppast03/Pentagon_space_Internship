let product={
    pname:"watch",
    price:1000,
    rating:5,
    stock:true,
    category:'electronics'
}
//console.log(product)
/// access or read the data
console.log(product.pname)
console.log(product['pname'])

// add or insert or write  new  properties to object
product.brand='apple'
console.log(product)
product['color']='red'
console.log(product)

//update or modify the data in exissting object
product.pname='samsung s25 ultra'
product.price=1400000
console.log(product)



//delete or remove the data in existing product
delete product.brand
delete product.category
console.log(product)