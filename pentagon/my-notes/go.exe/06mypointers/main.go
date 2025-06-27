package main
import "fmt"
func main(){
	fmt.Println("welcome to a class on pointers")
	// var ptr *int=2
	// fmt.Println("values of pointer is",ptr)

	myNumber:=23
	var ptr = &myNumber
	fmt.Println("Value of actual is",ptr)
	fmt.Println("Value of actual is",*ptr)

	*ptr=*ptr+2
	fmt.Println("new Value is",myNumber)

}