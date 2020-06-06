/*
 * Author:       FlaviuBenta
 * Create date:  28.12.2019
 * Requirement:   Display the max digit from a number.
 */

import java.util.Scanner;

public class MaxDigit {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        int maxdigit = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > maxdigit) {

                maxdigit = digit;
            }

            number = number / 10;
        }
        System.out.println("Max digit is: " + maxdigit);
    }
}
