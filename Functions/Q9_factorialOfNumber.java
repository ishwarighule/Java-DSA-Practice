/*
Write a program to print the factorial of a number by
defining a method named 'Factorial'. Factorial of any
number n is represented by n! and is equal to
 1 * 2 * 3 * .... * (n-1) *n.

 E.g.-
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
 */
import java.util.*;

public class Q9_factorialOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Factorial is: "+ factorial(n) );
    }

    static int factorial(int n){

        if(n==0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}

