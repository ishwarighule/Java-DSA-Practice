/*
Define a program to find out whether a given number is even or odd.
 */
import java.util.*;
public class Q2_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOrNot(n);
        sc.close();
    }

    public static void evenOrNot(int n) {

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
