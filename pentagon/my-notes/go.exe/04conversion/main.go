package main
import(
	 "fmt"
	 "os"
	 "bufio"
	 "strings"
	
	
	 "strconv"

)
func main(){
	fmt.Println("Hello welcome to pizza app")
	fmt.Println("plz rate our pizza b/w 1to9")


	reader:=bufio.NewReader(os.Stdin)
	input,_:=reader.ReadString('\n')
	fmt.Println("tq for rating",input)


	numRating,err:=strconv.ParseFloat(strings.TrimSpace(input),64)
	if err!=nil{
		fmt.Println(err)
	} else {
	fmt.Println("adding 1 to ur string",numRating+1)
    }
}