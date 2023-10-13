import java.util.Scanner;

public class areaOftriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of triangle");
        int base = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("Area of Triangle is: "+ (0.5 * (base * height)));
    }
}
