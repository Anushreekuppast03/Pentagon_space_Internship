// DESTRUCTURING OF ARRAY OR OBJECT

// It is a technique in javascript to unpack properties
// of arrays or objects into distinct variables

// example: array destructuring
var productDetails = ["I phone 15 pro", "Samsung s24 ultra", "One plus 12", "Vivo v29", "Oppo f9 pro"];

// old approach
var model1Old = productDetails[0];
var model2Old = productDetails[1];
console.log(model1Old);
console.log(model2Old);

// new approach
var [model1, model2] = productDetails;
console.log(model1);
console.log(model2);

// skipping elements
var [firstModel, , thirdModel] = productDetails;
console.log(firstModel); // Output: I phone 15 pro
console.log(thirdModel);  // Output: One plus 12

// rest parameters in array destructuring
var [first, second, ...remainingModels] = productDetails;
console.log(first);           // Output: I phone 15 pro
console.log(second);          // Output: Samsung s24 ultra
console.log(remainingModels); // Output: [ 'One plus 12', 'Vivo v29', 'Oppo f9 pro' ]

// assigning to new variable names (not shown in this specific image but related to destructuring)
// var [firstItem: firstProduct, secondItem: secondProduct] = productDetails;
// console.log(firstProduct);
// console.log(secondProduct);

var product = { brand: "Apple", model: "iPhone 15 Pro" };
var { brand: phoneBrand, model: phoneModel } = product;
console.log(phoneBrand); // Output: Apple
console.log(phoneModel); // Output: iPhone 15 Pro
