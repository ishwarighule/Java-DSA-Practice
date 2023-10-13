import java.util.Scanner;

public class areaOFparallelogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of parallelogram");
        int base = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("Area of parallelogram is: "+  (base * height));
    }
}
