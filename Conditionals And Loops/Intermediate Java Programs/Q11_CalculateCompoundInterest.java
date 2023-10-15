// Compound Interest
import java.util.*;

public class Q11_CalculateCompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter principal pamt: ");
        double pamt = sc.nextDouble();
        System.out.println("enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("enter time period: ");
        double time = sc.nextDouble();

        System.out.println(compundInt(pamt,rate,time));
    }

    static double compundInt(double pamt, double rate, double time){
        return pamt * Math.pow((1+rate/100), time)- pamt;
    }
}
