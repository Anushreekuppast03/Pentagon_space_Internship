package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	fmt.Println("switch and case in golang")

	rand.Seed(time.Now().UnixNano())
	diceNumber := rand.Intn(6) + 1
	fmt.Println("value of a dice is", diceNumber)

	switch diceNumber {
	case 1:
		fmt.Println("dice value is 1 and u can open")
	case 2:
		fmt.Println("u can move 2 spot")
	case 3:
		fmt.Println("u can move to 3 spot")
	case 4:
		fmt.Println("u can move to 4 spot")
	case 5:
		fmt.Println("u can move to 5 spot")
	case 6:
		fmt.Println("u can move to 6 spot & oll dice again")
	default:
		fmt.Println("wt was that")
	}
}
