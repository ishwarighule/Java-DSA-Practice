import java.util.Scanner;

public class areaOFEquilateralTriangle {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side of the Triangle:");
        double a = sc.nextDouble();
        double area=0;
        area = Math.sqrt(3) / 4 * a * a;

        System.out.println("Area of Equilateral Triangle:" + area);

    }
}
