import java.util.Scanner;

public class volumeOfPrism {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of Prism");
        float base = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.println("Volume Of Prism is: "+ (base * height));
    }

}

/*
Volume Of Cylinder : 3.14 * r * r * h
Volume Of Sphere : 4/3 * 3.14 * r * r * r
Volume Of Pyramid: l * w * h/3

Curved Surface Area Of Cylinder : 2 * 3.14 * r * h
Total Surface Area Of Cube: 6 *a*a

 */
