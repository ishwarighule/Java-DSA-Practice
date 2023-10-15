/*
Write a program to print the sum of negative numbers,
sum of positive even numbers and the sum of positive odd numbers from
a list of numbers (N) entered by the user. The list terminates when
the user enters a zero.
 */

import java.util.*;

public class Q27_SumOfNegativePostiveEvenOdd {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int num, sumOfNegative = 0, sumOfEven=0, sumOfOdd=0;

        System.out.println("Enter the numbers to get sum and 0 to exit");

        while (true){

            num = sc.nextInt();

            if (num < 0){
                sumOfNegative += num;
            }
            else {

                if(num % 2==0){
                    sumOfEven +=num;
                }
                else {
                    sumOfOdd += num;
                }
            }

            if(num ==0){

                System.out.println("Sum of Negative Numbers: "+ sumOfNegative);
                System.out.println("Sum of Even Numbers: "+ sumOfEven);
                System.out.println("Sum of Odd Numbers: "+ sumOfOdd);
            }

        }


    }
}
