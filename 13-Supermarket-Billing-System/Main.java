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


# Supermarket Billing System 🛒

This is a simple Java console-based Supermarket Billing System.

The program allows users to select items from a menu and automatically calculates the total bill. The system continues running until the user chooses the checkout option.

## Available Items

1. Rice – ₹50  
2. Milk – ₹30  
3. Bread – ₹40  

## Features

- Menu-driven billing system
- Add items to the cart
- Automatically updates total bill
- Checkout option to display final bill
- Simple and beginner-friendly logic

## Concepts Used

- Java Basics
- `Scanner` class for user input
- `if-else` conditional statements
- `do-while` loop
- Basic arithmetic operations

## Sample Output
SUPERMARKET BILLING SYSTEM 

- Rice - ₹50

- Milk - ₹30

- Bread - ₹40

   Checkout

Choose item: 1
Rice added to cart

Choose item: 2
Milk added to cart

Choose item: 4
Total Bill: ₹80
Thank you for shopping Yuvi 😎
