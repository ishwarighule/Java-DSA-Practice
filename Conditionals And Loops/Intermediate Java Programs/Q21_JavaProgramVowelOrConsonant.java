// Java Program Vowel Or Consonant

import java.util.*;

public class Q21_JavaProgramVowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the letter: ");
        char ch = sc.next().charAt(0);

        if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ){
            System.out.println("Vowel");

        }
        else {
            System.out.println("Consonent");
        }
    }
}
