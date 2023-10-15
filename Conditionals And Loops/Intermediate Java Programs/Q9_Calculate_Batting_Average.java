// // Calculate Batting Average

import java.util.*;

public class Q9_Calculate_Batting_Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of runs");
        int runs = sc.nextInt();

        System.out.println("enter total no. of matches");
        int matches = sc.nextInt();

        System.out.println("enter no. of not-out matches");
        int notoutmatches = sc.nextInt();

        int outmatches = matches- notoutmatches;

        double batavg = runs/outmatches;
        System.out.println("Batting average= " + batavg);


    }
}
