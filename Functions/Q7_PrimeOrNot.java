/*
Define a method to find out if a number is prime or not.
 */
import java.util.*;
public class Q7_PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        if(isprime(n)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
    static boolean isprime(int n){
        boolean isprime=true;
        for (int i=1; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }
}
