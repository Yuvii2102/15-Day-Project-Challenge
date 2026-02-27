import java.util.Scanner;

public class StudentGradeCalculator 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int s4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } 
        else if (percentage >= 80) {
            System.out.println("Grade: A");
        } 
        else if (percentage >= 70) {
            System.out.println("Grade: B");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade: C");
        } 
        else if (percentage >= 50) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
