import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and breadth of Parallelogram");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double ans;
        ans = 2*(a+b);
        System.out.println("Perimeter Of Parallelogram is: "+ ans);
    }
}
