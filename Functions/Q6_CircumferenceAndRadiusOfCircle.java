/*
Write a program to print the circumference and
area of a circle of radius entered by user by
defining your own method.
 */

import java.util.*;
public class Q6_CircumferenceAndRadiusOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = sc.nextDouble();
        float pi= (float) 3.14;
        System.out.println("Area of circle is: " + area(r, pi));
        System.out.println("Circumference of Circle is: "+cir(r,pi));
    }

    static double area(double r, float pi){
        return pi*r*r;
    }

    static double cir(double r, float pi){
        return 2*pi*r;
    }
}
