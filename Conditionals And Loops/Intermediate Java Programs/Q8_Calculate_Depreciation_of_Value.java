import java.util.*;

public class Q8_Calculate_Depreciation_of_Value {
    public static void main(String[] args) {

        long amount,dppercent,year,temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter amount");
        amount = sc.nextLong();

        System.out.println("enter Depreciation percentage");
        dppercent = sc.nextLong();

        System.out.println("enter  number of years");
        year=sc.nextLong();

        temp=amount;

        for(int i=0;i<year;i++) {
            temp = ((100 - dppercent) * temp) / 100;
        }
        System.out.println("after depreciation = "+temp);
        sc.close();


    }
}
