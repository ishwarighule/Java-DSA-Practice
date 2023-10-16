/*
Palindrome number or not
 */
import java.util.*;

public class Q10_PalindromeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        boolean ispalindrome= ispalindrome(n);

        if(ispalindrome){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }

    static boolean ispalindrome(int n){

        int temp=n;
        int rev=0;

        while(temp!=0){

            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return n == rev;
    }

}
