import java.util.Scanner;

public class powerInJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter power");
        int p = sc.nextInt();

        int power=1;

        System.out.println(num + " to the power of"+ p + "is: ");

        while (p!=0){
            power *= num;
            p--;
        }
        System.out.println(power);
        sc.close();
    }
}
