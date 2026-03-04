import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== SIMPLE QUIZ =====");

        // Question 1
        System.out.println("1. Java is a ?");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Database");

        int ans1 = sc.nextInt();

        if (ans1 == 1) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Who developed Java?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");

        int ans2 = sc.nextInt();

        if (ans2 == 2) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Java is ?");
        System.out.println("1. Platform Independent");
        System.out.println("2. Platform Dependent");

        int ans3 = sc.nextInt();

        if (ans3 == 1) {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");

        sc.close();
    }
}
