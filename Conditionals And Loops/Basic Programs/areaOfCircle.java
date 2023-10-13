import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r = sc.nextFloat();

        System.out.println("Area of Circle is: "+ (3.14 * r * r));
    }
}
