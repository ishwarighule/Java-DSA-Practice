// Find HCF of 2 no's

import java.util.*;

public class Q19_HCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int n= sc.nextInt();
        int m = sc.nextInt();

        int max = Math.max(n,m);

        for(int i=max; i>=1; i--){

            if(n%i==0 && m%i==0){
                System.out.println("HCF is "+i);
                break;
            }

        }
    }

}
