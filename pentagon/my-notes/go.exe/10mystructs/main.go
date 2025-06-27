package main

import "fmt"

func main() {
	fmt.Println("structs in golang")
	//no inharitance in golang

	hitech := User{"Hitesh", "anu@gmail.com", true, 16}
	fmt.Println(hitech)
	fmt.Printf("hitesh details are: %+v\n", hitech)
	fmt.Printf("name is %v and email is %v.", hitech.Name, hitech.Emil)
}

type User struct {
	Name   string
	Emil   string
	Status bool
	Age    int
}
