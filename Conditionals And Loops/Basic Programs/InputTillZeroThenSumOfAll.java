/*
Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

 */
import java.util.*;

public class InputTillZeroThenSumOfAll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n;

        do{
            n = sc.nextInt();
            sum += n;

        }
        while(n != 0);

        System.out.print("Sum =" + sum);

    }
}
