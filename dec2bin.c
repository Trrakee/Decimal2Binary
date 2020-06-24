// C decimal to binary
// @author: Tushar Sharma
#include <stdio.h>
int main()
{
    int userInput, index, answer;

    printf("Please Enter a Number to be Converted: ");
    scanf("%d", &userInput);

    printf("%d in binary is:\n", userInput);

    for (index = 31; index >= 0; index--)
    {
        answer = userInput >> index;
        if (answer & 1)
            printf("1");
        else
            printf("0");
    }
    printf("\n");
    return 0;
}