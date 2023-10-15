import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kwh used:");
        double watt = sc.nextDouble();

        System.out.println("cost of kwh:");
        double rate = sc.nextDouble();

        System.out.println("Number of days used:");
        int days = sc.nextInt();

        double bill=0;

        if(watt > 0 && rate > 0 && days >0){

            bill = watt * rate;
            bill= bill / days;
            System.out.println("Bill is " + bill);

       }
        else {
            System.out.println("Invalid data");
        }

    }
}
