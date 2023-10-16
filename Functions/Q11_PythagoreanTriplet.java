/*
Write a function to check if a given triplet is a
Pythagorean triplet or not.
(A Pythagorean triplet is when the sum of the square of
two numbers is equal to the square of the third number).
 */
import java.util.*;

public class Q11_PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Enter third number :");
        int c = sc.nextInt();
        if(tripletOrNot(a, b, c)){
            System.out.println("Yes, These are pythagorean triplet!");
        }
        else{
            System.out.println("No, These are not a pythagorean triplet!");
        }
        sc.close();
    }
    public static boolean tripletOrNot(int a, int b, int c) {
        if (a < b && b < c) {
            if (a * a + b * b == c * c) {
                return true;
            }
        }
        return false;
    }
}
