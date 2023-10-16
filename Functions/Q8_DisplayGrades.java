/*
Write a program that will ask the user to enter his/her
marks (out of 100). Define a method that will display grades
according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
 */
import java.util.*;
public class Q8_DisplayGrades {
    public static void main(String[] args) {

        int totalmarks=0;
        int percentage, avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects: ");
        int sub = sc.nextInt();

        for (int i=1; i<= sub; i++){
            System.out.println("Enter marks out of 100:");
            int n = sc.nextInt();
            totalmarks += n;
        }

        double substotal = sub*100;
        double g = ((totalmarks/substotal)*100);
        System.out.println("Your percentage is: "+ g);
        grades(g);
    }

    static void grades(double g){

        if(g>=91 && g<=100){
            System.out.println("AA");
        }
        else if (g>=81 && g<=90) {
            System.out.println("AB");
        }
        else if (g>=71 && g<=80) {
            System.out.println("BB");
        }
        else if (g>=61 && g<=70) {
            System.out.println("BC");
        }
        else if (g>=51 && g<=60) {
            System.out.println("CD");
        }
        else if (g>=41 && g<=50) {
            System.out.println("DD");
        }
        else if (g<=40) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Marks");
        }

    }
}
