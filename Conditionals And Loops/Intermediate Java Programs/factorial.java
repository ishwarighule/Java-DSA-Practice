import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factorialno = 1;

        if(num==1 || num==0){
            System.out.println("1");;
        }
        else {

            for (int i=1; i<=num; i++){
                factorialno *= i;
            }
        }

        System.out.println(factorialno);

    }
}
