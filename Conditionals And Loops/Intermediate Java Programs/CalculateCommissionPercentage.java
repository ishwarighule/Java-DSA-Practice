import java.util.*;

public class CalculateCommissionPercentage {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amt = in.nextDouble();

        System.out.println("Enter the commissionPercentage:");
        double cp = in.nextDouble();

        double com = (cp/100)*amt;
        System.out.println("Commission amount:"+ com);

    }






    /*
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sales: ");
        int sales = in.nextInt();

        System.out.print("Enter the commission percentage: ");
        int comm = in.nextInt();

        System.out.print("Enter the number of commission rates: ");
        int rates = in.nextInt();

        System.out.print("Enter the commission rates: ");
        int[] ratesArray = new int[rates];

        for(int i = 0; i < rates; i++){
            ratesArray[i] = in.nextInt();
        }
        // Calculate commission
        int commission = 0;

        for(int i = 0; i < rates; i++){
            if(sales >= ratesArray[i]){
                commission += (sales * comm / 100);
            }
        }
        System.out.println("The commission is: " + commission);

    }

     */
}
