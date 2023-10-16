/*
A person is eligible to vote if his/her age is greater than
or equal to 18. Define a method to find out if he/she is
eligible to vote.
 */

import java.util.*;
public class Q3_EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        iseligible(age);
    }
    static void iseligible(int age){
        if(age>= 18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
