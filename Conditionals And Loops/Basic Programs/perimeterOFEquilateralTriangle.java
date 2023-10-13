import java.util.Scanner;

public class perimeterOFEquilateralTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side of equi triangle");
        double side = sc.nextDouble();
        double ans;
        ans = (3* side);
        System.out.println("Perimeter of equi triangle is: "+ ans);
    }
}
