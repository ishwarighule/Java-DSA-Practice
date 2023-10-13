import java.util.Scanner;

public class periOfSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        double a = sc.nextDouble();
        double ans;
        ans = 4* (a);
        System.out.println("Perimeter Of square is: "+ ans);
    }
}
