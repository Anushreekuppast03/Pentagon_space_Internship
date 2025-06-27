package main
import "fmt"
func main(){
	fmt.Println("welcome to array in golang")

	var fruitList[4]string
	fruitList[0]="Apple"
	fruitList[1]="tomato"
	fruitList[3]="banana"

	fmt.Println("Eruit List is:",fruitList)
	fmt.Println("Fruit list is:",len(fruitList))



	var vegList=[5]string{"potato","beans","mushroom"}
	fmt.Println("veg List is:",vegList)
	fmt.Println("veg list is:",len(vegList))

}