//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class largest_No_Entered_till_now {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
       int largestnum=0;

        while (true){
            int n = sc.nextInt();
            if(n > largestnum){
                largestnum =n;
            }
            else if (n == 0){
                break;
            }

        }
        System.out.println(largestnum);

        */



        // better approch

        int n,temp;
        int max=0;

        do{
            n= sc.nextInt();
            temp =n;
            if(temp > max){
                max = temp;
            }
        }
        while(n!=0);
        System.out.println("Largest number entered till now: " + max);
    }
}
