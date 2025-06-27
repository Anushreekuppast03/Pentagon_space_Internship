package main

import "fmt"

func main() {
	fmt.Println("welcomw to loops in golang")
	days := []string{"sun", "tue", "wed", "Thu", "fri", "sat"}
	fmt.Println(days)

	// for d := 0; d < len(days); d++ {
	// 	fmt.Println(days[d])
	// }

	// for i := range days {
	// 	fmt.Println(days[i])
	// }

	for index, day := range days {
		fmt.Printf("index is %d and value is %v \n", index, day)
	}
}
