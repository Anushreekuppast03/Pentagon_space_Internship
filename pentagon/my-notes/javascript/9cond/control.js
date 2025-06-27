//else
function even(num){
    if(num%2==0){
        console.log("even")
    }
}
even(6)
//else 
function evenodd(num1){
    if(num1%2==0){
        console.log("even")
    }
    else{
        console.log("0dd")
    }
}
evenodd(7)
//else
function posneg(num2){
    if(num2>0){
        console.log("positive")
    }
    else if(num2<0){
        console.log("negative")
    }
    else{
        console.log("zero")
    }
}
posneg(-1)
//else if
function msg(num3){
    if(num3==="gm"){
        console.log("gm")
    }
    else if(num3==="gn"){
        console.log("gn")
    }
    else if(num3==="ga"){
        console.log("ga")
    }
    else{
        console.log("try another")
    }
}
msg()

//switch

function msgs(value) {
    switch(value) {
      case 1:
        console.log("gm");
        break;
      case 2:
        console.log("gm");
        break;  
      default:
        console.log("Invalid input");
    }
  }
  
  msgs(1); // Calling the function with 1

  //ternary operator
  100<120? console.log("true"):console.log("false")
   
  let name="virat"
  name.includes("anu")?console.log("true"):console.log("false")

  //else if
  function ms(num5){
    if(num5>90){
        console.log("grade A")
    }
    else if(num5>80){
        console.log("grade b")
    }
    else if(num5>70){
        console.log("grade c")
    }
    else if(num5>60){
        console.log("grade d")
    }
    else{
        console.log("fail")
    }
}
ms(82)
//switch
function msgss(values) {
    switch(values) {
      case 1:
        console.log("mon");
        break;
      case 2:
        console.log("tue");
        break;  
        case 3:
            console.log("wed");
            break;  
            case 4:
                console.log("thu");
                break;  
                case 5:
                    console.log("fri");
                    break;  
                    case 6:
                    console.log("sat");
                    break; 
                    case 7:
                    console.log("sun");
                    break;   
      default:
        console.log("Invalid input");
    }
  }
  msgss(4)
//
  function compareNumbers(num1, num2) {
    let result = (num1 === num2) ? "Both numbers are equal"
               : (num1 > num2) ? "First number is greater"
               : "Second number is greater";
    
    console.log(result);
}
compareNumbers(5, 5);   // Output: Both numbers are equal
compareNumbers(8, 3);