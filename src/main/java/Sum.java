/*
 * Author:       FlaviuBenta
 * Create date:  27.12.2019
 * Requirement:   Calculate the sum of the first 100 numbers higher than 0
 */


public class Sum {
    public static void main(String[] args ){

        int num = 100, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println(" Sum = " + sum);
    }
}
