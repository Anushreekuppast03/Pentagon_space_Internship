package main
import(
	"bufio"
"fmt"
"os"
)
func main(){
	welcome:="welcome to home"
	fmt.Println(welcome)

	reader:=bufio.NewReader(os.Stdin)
    fmt.Println("enter the rating of pizza")

	//comma OR//err ok
	input,_:=reader.ReadString('\n')
	fmt.Println("tq for rating",input)
	fmt.Printf("Type of rating: %T \n",input)

}