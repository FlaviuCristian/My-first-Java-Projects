/*
 * Author:       FlaviuBenta
 * Create date:  30.12.2019
 * Requirement:   Check if a number is palindrom
 */

import java.util.Scanner;

public class PalindromNumber {

    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: "); // the number is not written in the code, it is entered from the keyboar
        number = scanner.nextInt();
        int reversNumber = 0;
        int temp = number;

        while ( number != 0) {

            reversNumber = reversNumber * 10 + number % 10;
            number = number / 10;
        }

        if (temp == reversNumber)
            System.out.println(temp + " is a palindrom.");
        else
            System.out.println(temp + " is not a palindrom");
    }
}
