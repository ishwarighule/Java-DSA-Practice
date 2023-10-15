import java.util.*;

public class Q10_Calculate_CGPA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5; //no of sub

        double[] mark = new double[n];
        double[] calc = new double[n];
        double cgpa;
        double sum=0;

        System.out.print("Enter marks of subject 1: ");
        mark[0] = sc.nextDouble();
        System.out.print("Enter marks of subject 2: ");
        mark[1] = sc.nextDouble();
        System.out.print("Enter marks of subject 3: ");
        mark[2] = sc.nextDouble();
        System.out.print("Enter marks of subject 4: ");
        mark[3] = sc.nextDouble();
        System.out.print("Enter marks of subject 5: ");
        mark[4] = sc.nextDouble();

        for (int i=0; i<n; i++){
            calc[i] = (mark[i]/10);
        }

        for(int i=0; i<n; i++){
            sum += calc[i];
        }

        cgpa=sum/n;
        System.out.println("CGPA: "+cgpa);
        System.out.println("PErcentage from CGPA: "+ cgpa*9.5);

    }
}
