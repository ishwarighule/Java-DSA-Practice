
        /* Calculate Future investment Value*/


import java.util.*;

public class Q18_CalculateFutureInvestmentValue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of principle: ");
        double principle = in.nextDouble();

        System.out.println("Enter the value of rate: ");
        double rate = in.nextDouble();

        System.out.println("Enter the value of time: ");
        double time = in.nextDouble();

        double fi = principle * (Math.pow((1 + rate / 100), time));

        System.out.println("Future Interest is "+ fi);


    }
}
