import java.util.Scanner;

public class perimeterOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle");
        float r = sc.nextFloat();
        float ans;
        ans = (float) (2 * 3.14 * r);
        System.out.println("Perimeter of Circle is: "+ ans);
    }
}
