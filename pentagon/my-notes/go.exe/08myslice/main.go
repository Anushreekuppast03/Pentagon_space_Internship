package main
import ("fmt"
"sort")
func main(){
	fmt.Println("welcome to slice in golang")

	var fruitList=[]string{"potato","beans","mushroom"}
	fmt.Println("Type of fruitList is %T\n",fruitList)

	fruitList=append(fruitList,"mango","banana")
	fmt.Println(fruitList)

	fruitList=append(fruitList[1:3])
	fmt.Println(fruitList)

highScores:=make([]int,4)
highScores[0]=543
highScores[1]=887
highScores[2]=876
highScores[3]=986
//highScores[4]=874

highScores=append(highScores,765,987,983)
fmt.Println(highScores)

sort.Ints(highScores)
fmt.Println(highScores)
fmt.Println(sort.IntsAreSorted(highScores))

// how to remiove a value from slices based on index

var courses=[]string{"css","html","python","go","java"}
fmt.Println(courses)

var index int =2
courses=append(courses[:index],courses[index+1:]...)
fmt.Println(courses)
}