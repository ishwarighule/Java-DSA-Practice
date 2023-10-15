// Sum Of N Numbers

import java.util.Scanner;

public class Q13_SumOfNNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int sum=n;

        while(n!=0){
            n = sc.nextInt();
            sum += n;
        }

        System.out.println("Sum: " + sum);

    }
}
