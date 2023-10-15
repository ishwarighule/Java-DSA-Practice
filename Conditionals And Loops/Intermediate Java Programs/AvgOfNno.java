import java.util.Scanner;

public class AvgOfNno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int sum =0;
        double avg;

        for (int i=1; i<=count; i++){

            int num = sc.nextInt();
            sum += num;
        }
        avg = sum/count;
        System.out.println(avg);



        }
}
