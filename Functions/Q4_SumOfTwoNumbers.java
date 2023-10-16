/*
Write a program to print the sum of two numbers entered
by user by defining your own method.
 */
import java.util.*;
public class Q4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is: " + sum(a,b));
    }

    static int sum(int a, int b){

        int sum=a+b;
        return sum;

    }
}
