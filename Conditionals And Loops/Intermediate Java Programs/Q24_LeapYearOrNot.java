//checks whether the entered year is leap year or not

import java.util.*;

public class Q24_LeapYearOrNot {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        while(true){
            System.out.print("Enter a year (0 to exit) : ");
            num = input.nextInt();
            if (num == 0) System.exit(0);
            else {
                if (leap_check(num))
                    System.out.println("Leap Year.");
                else
                    System.out.println("Not a Leap Year.");
            }
        }
    }
    static boolean leap_check(int n){
        if (( n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
            return true;
        else
            return false;
    }
}

