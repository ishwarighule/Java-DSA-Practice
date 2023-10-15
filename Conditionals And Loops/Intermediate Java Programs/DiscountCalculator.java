import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Original Price");
        double orginalPrice = sc.nextDouble();

        double discount = 0;

        if (orginalPrice >1000){
            discount = orginalPrice *0.1;
        }
        else if (orginalPrice > 500){
            discount = orginalPrice * 0.2;
        }
        else {
            discount = orginalPrice * 0.3;
        }

        double total =orginalPrice - discount;
        System.out.println("Total Price Of Product Is "+total);
        System.out.println("Discount is "+ discount);
    }
}
