/*
Kunal is allowed to go out with his friends only on the even days of a
given month. Write a program to count the number of days he can
go out in the month of August.
 */

import java.util.*;

public class Q26_NoOfDaysHeCanGoOut {
    public static void main(String[] args) {

        int aug=31;
        int sum=0; // counting no of days he can go out

        for(int i=1; i<= aug; i++){

            if (i%2==0){

                sum++;
            }
        }

        System.out.println("Total numkber of days Kunal can go out: "+ sum);

    }
}
