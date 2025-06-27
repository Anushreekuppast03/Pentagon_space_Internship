package main
import "fmt"

const LoginToken string="anushree"

func main(){
var userName string="anu"
    fmt.Println(userName)
	fmt.Printf("Variable is of type: %T \n",userName)


var isLogged bool=true
    fmt.Println(isLogged)
	fmt.Printf("Variable is of type: %T \n",isLogged)


var smallValue float32=238.9776
    fmt.Println(smallValue)
	fmt.Printf("Variable is of type: %T \n",smallValue)


	//default values and some alias
	var anotherVariable int
    fmt.Println(anotherVariable)
	fmt.Printf("Variable is of type: %T \n",anotherVariable)



	//implicit type
	var website="w3school.in"
	fmt.Println(website)

	//no var style
	numberOfUser:=3000.0
	fmt.Println(numberOfUser)

	fmt.Println(LoginToken)
	fmt.Printf("Variable is of type: %T \n",LoginToken)

}