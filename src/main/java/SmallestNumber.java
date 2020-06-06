/*
 * Author:       FlaviuBenta
 * Create date:  28.12.2019
 * Requirement:   Display the smallest number from an array of number.
 */

public class SmallestNumber {

    public static void main(String[] args) {

        int array[] = {9,56,5,13,99,25,23,97,8,7};
        int smallest = array[0];


        for(int i=1; i< array.length; i++)

        {
            if(array[i] < smallest)
                smallest = array[i];
        }

        System.out.println("Smallest Number is : " + smallest);
    }
}
