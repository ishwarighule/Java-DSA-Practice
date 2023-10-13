import java.util.Scanner;

public class areaOFRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagonal1 and diagonal2 of Rhombus");
        int diagonal1 = sc.nextInt();
        int diagonal2 = sc.nextInt();

        System.out.println("Area of Rhombus is: "+ ((diagonal1 * diagonal2)/2));


    }
}
