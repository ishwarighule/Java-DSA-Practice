/*
Factorial Program In Java

factorial: the product of all positive integers less than or equal to a given
            positive integer and denoted by that integer and an exclamation point.
 */

import java.util.Scanner;

public class Factorial_Number_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factorial=1;

        if(num==1 || num==0){
            System.out.println("1");
        }
        else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}