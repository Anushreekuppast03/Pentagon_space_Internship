package main

import "fmt"

func main() {
	fmt.Println("welcome to function in golang")
	greeter()
	greeterTwo()


	//++++++++++
	result := adder(3, 5)

	fmt.Println("result is:", result)


	
	//+++++++++++
	proRes, myMsg := proAdder(2, 5, 6, 7)
	fmt.Println("pro result is", proRes, myMsg)
}

//-----------------------------------------------------------------




//&&&&&&&&&&&&&
func greeterTwo() {
	fmt.Println("another  method")

}

func greeter() {
	fmt.Println(("hi from golang"))
}




//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
func adder(valOne int, valTwo int) int {
	return valOne + valTwo
}





//&&&&&&&&&&&
func proAdder(values ...int) (int, string) {
	total := 0

	for _, val := range values {
		total += val
	}
	return total, "hi pro result fun"
}