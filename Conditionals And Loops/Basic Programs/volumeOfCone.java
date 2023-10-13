import java.util.Scanner;

public class volumeOfCone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height of Cone");
        int r = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("Volume Of Cone is: "+ (3.14* r*r *height/3));
    }

}
