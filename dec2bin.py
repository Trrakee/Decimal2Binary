# Python decimal to binary
# @author: Tushar Sharma
def DecimalToBinary(num): 
      
    if num > 1: 
        DecimalToBinary(num // 2) 
    print(num % 2, end = '') 
  
if __name__ == '__main__': 
    txt = input("Please Enter a Number to be Converted: ")
    # decimal value 
    dec_val = txt
      
    # Calling function 
    DecimalToBinary(int(dec_val)) 