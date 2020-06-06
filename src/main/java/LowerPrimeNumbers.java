/*
 * Author:       FlaviuBenta
 * Create date:  28.12.2019
 * Requirement:   Display all the prime numbers lower than a given number.
 */

import java.util.Scanner;

public class LowerPrimeNumbers {

    public static void main(String[] args) {

        int i;
        int num;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        String primeNumbers = "";

        for (i = 1; i <= number; i++) {

            int counter = 0;

            for (num = i; num >= 1; num--) {

                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("The prime number are : " + primeNumbers);
    }
}