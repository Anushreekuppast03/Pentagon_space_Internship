package main
import "fmt"
func main(){
	fmt.Println("maps in go lang")

	language :=make(map[string]string)
	language["js"]="javascript"
	language["RB"]="Ruby"
	language["py"]="python"

	fmt.Println("list of all language:",language)
	fmt.Println("js shorter for:",language["js"])

	delete (language,"RB")
	fmt.Println("lisst of all language:",language)
	///loops are interseting in golang

	for key,value:=range language{
		fmt.Printf("for key %s ,value is %s \n",key ,value)
	}
}