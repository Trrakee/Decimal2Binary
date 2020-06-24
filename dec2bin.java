// Java decimal to binary
// @author: Tushar Sharma

import java.util.Scanner;

class dec2bin {
    public static void main(final String[] args) {
        System.out.print("Please Enter a Number to be Converted: ");
        final Scanner userInput = new Scanner(System.in);
        final int enteredInput = userInput.nextInt();
        System.out.println(decimal2binary(enteredInput));
        userInput.close();
    }

    static String decimal2binary(int decimal) {
        String answer = "";
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--)
            answer += binary[i];
        return answer;
    }
}
