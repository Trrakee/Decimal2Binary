//  GoLang decimal to binary
// @author: Tushar Sharma
package main  
  
import (  
 "fmt"  
 "strconv"  
)  
func main() {  
 var decimal int64  
	fmt.Print("Please Enter a Number to be Converted: ")
 fmt.Scanln(&decimal)  
 output := strconv.FormatInt(decimal, 2)  
 fmt.Print("Answer: ", output)  
}  