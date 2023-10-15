import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int number, reverse = 0;
        number = num;

        while(num != 0){
            reverse = num % 10 + reverse * 10;
            num /= 10;
        }

        if (number == reverse){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }

}
