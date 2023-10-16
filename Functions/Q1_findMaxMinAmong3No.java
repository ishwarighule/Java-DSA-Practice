/*
Define two methods to print the maximum and the
minimum number respectively among three numbers
entered by the user.
 */
import java.util.*;

public class Q1_findMaxMinAmong3No {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Minimum number is: "+ minimum(num1, num2, num3));
        System.out.println("Maximum number is: "+ maximum(num1, num2, num3));
        sc.close();
    }
    public static int minimum(int num1,int num2,int num3){
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        if(num3 < min) {
            min = num3;
        }
            return min;
    }
    public static int maximum(int num1,int num2,int num3){
        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        return max;
    }
}
