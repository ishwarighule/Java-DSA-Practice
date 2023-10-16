/*
Define a method that returns the product of two
numbers entered by user.

 */
import java.util.Scanner;

public class Q5_productOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product is: " + prod(a,b));
    }

    static int prod(int a, int b){

        int product=a*b;
        return product;

    }
}
