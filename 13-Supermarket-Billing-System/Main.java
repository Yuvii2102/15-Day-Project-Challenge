import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double total = 0;

        do {
            System.out.println("\n===== SUPERMARKET BILLING SYSTEM =====");
            System.out.println("1. Rice - ₹50");
            System.out.println("2. Milk - ₹30");
            System.out.println("3. Bread - ₹40");
            System.out.println("4. Checkout");

            System.out.print("Choose item: ");
            choice = sc.nextInt();

            if (choice == 1) {
                total += 50;
                System.out.println("Rice added to cart");
            }

            else if (choice == 2) {
                total += 30;
                System.out.println("Milk added to cart");
            }

            else if (choice == 3) {
                total += 40;
                System.out.println("Bread added to cart");
            }

            else if (choice == 4) {
                System.out.println("Total Bill: ₹" + total);
                System.out.println("Thank you for shopping Yuvi 😎");
            }

            else {
                System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
