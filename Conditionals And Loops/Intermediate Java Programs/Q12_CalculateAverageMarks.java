// Calculate Average Marks

import java.util.*;

public class Q12_CalculateAverageMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks: ");
        double marks = sc.nextDouble();

        double sum=0;
        int num=0;

        while (marks!=-1){

            sum+= marks;
            num++;
            marks = sc.nextDouble();
        }
        double avg = sum/num;
        System.out.println("Average: " +avg);
    }
}
