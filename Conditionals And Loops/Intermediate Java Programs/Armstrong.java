import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int temp = num1;
        int sum = 0;

            while (num1 > 0){
                int rem  = num1 % 10;
                sum= sum + (rem * rem * rem);
                num1 = num1/10;
            }

            if(temp == sum){
                System.out.print("Armstrong");
            }
            else {
                System.out.println("Not Armstrong");
        }
    }
}
