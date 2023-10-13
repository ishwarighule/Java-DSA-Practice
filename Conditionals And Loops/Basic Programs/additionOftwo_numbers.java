//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class additionOftwo_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = sum(num1,num2);
        System.out.println(sum(num1,num2));

    }

    static int sum(int num1 ,int num2 ){

        int add = num1 + num2;
        return add;
    }
}
