/*
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

q. 1281

Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
 */

import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n));
    }

    static int ans(int n){

        int sum= 0;
        int product=1;

        while (n > 0){

            int temp = n%10;
            sum += temp;
            product *= temp;
            n /= 10;
        }

        return product - sum;

    }
}
