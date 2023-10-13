import java.util.Scanner;

public class areaOfIsolatedTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of triangle");
        float base = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.println("Area of Triangle is: "+ ((base * height)/2));
    }
}
