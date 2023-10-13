import java.util.Scanner;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        int num = sc.nextInt();

        int a=0;
        int b=1;
        int c;

        System.out.print(a + " " + b +" ");

        for(int i=2; i<num; i++){
            c = a + b;
            System.out.print(c +" ");
            a = b;
            b = c;
        }

         */

        int num = sc.nextInt();

        int a=0;
        int b=1;
        System.out.print(a+ " " +b+" ");

        for(int i=0; i<num; i++){
            int temp = a +b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
        sc.close();


    }
}
