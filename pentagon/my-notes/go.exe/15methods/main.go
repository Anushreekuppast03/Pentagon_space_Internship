package main

import "fmt"

func main() {
	fmt.Println("method in Golang")

	// No inheritance in Golang
	hitech := User{"Hitesh", "anu@gmail.com", true, 16}
	fmt.Println(hitech)
	fmt.Printf("Hitesh details are: %+v\n", hitech)
	fmt.Printf("Name is %v and Email is %v.\n", hitech.Name, hitech.Email)

	hitech.GetStatus()
	hitech.NewMail()
	fmt.Printf("Updated Email is: %v\n", hitech.Email)
}

type User struct {
	Name   string
	Email  string
	Status bool
	Age    int
}

func (u User) GetStatus() {
	fmt.Println("Is user active:", u.Status)
}

// Pointer receiver to modify the original struct field
func (u *User) NewMail() {
	u.Email = "bkanushree03@gmail.com"
	fmt.Println("Email of this user is", u.Email)
}
//