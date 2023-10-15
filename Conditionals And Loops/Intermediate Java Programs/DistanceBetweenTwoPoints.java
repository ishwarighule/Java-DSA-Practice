import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x1, x2 points : ");
        int x1 =sc.nextInt();
        int x2 = sc.nextInt();

        System.out.print("Enter the y1, y2 points : ");
        int y1 =sc.nextInt();
        int y2 = sc.nextInt();

        double distance = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
        System.out.println(" distance btn 2 points is "+distance);

    }
}
