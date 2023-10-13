import java.util.Scanner;

public class periOfRhombus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of rhombus");
        double a = sc.nextDouble();
        double ans;
        ans = 4* (a);
        System.out.println("Perimeter Of rhombus is: "+ ans);
    }
}
