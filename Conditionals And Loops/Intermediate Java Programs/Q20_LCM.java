// Find LCM of 2 no's

import java.util.*;

public class Q20_LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = Math.max(n, m);
        int red = 0;

        if (n == 1 || m == 1) {
            System.out.println("LCM is " + 1);
        }
        else {

            for (int i =2; i<=max; i++) {

                if (n % i == 0 && m % i == 0) {
                    System.out.println("LCM is " + i);
                    red=1;
                    break;
                }
            }

            if(red == 0){
                System.out.println("LCM is"+ n*m);
            }

        }
    }


}
