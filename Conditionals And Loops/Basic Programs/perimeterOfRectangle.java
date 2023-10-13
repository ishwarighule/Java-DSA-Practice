import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and width of rectangle");
        double width = sc.nextDouble();
        double length = sc.nextDouble();
        double ans;
        ans = 2* (length + width);
        System.out.println("Perimeter Of rectangle is: "+ ans);
    }
}
