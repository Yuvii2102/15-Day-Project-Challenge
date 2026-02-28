import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();

        int choice = 0;
        double total;

        do {
            System.out.println("\n===== MINI E-COMMERCE CART =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");

                    if (sc.hasNextDouble()) {
                        double price = sc.nextDouble();
                        sc.nextLine();
                        cart.add(new Product(name, price));
                        System.out.println("Product added!");
                    } else {
                        System.out.println("Invalid price!");
                        sc.nextLine();
                    }
                    break;

                case 2:
                    total = 0;
                    System.out.println("\n--- Cart Items ---");
                    for (Product p : cart) {
                        System.out.println(p.name + " - ₹" + p.price);
                        total += p.price;
                    }
                    System.out.println("Total: ₹" + total);
                    break;

                case 3:
                    total = 0;
                    for (Product p : cart) {
                        total += p.price;
                    }
                    System.out.println("Checkout successful!");
                    System.out.println("Total Bill: ₹" + total);
                    cart.clear();
                    break;

                case 4:
                    System.out.println("Thank you Yuvi 😎");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}




# Mini E-Commerce Cart 🛒

This is a simple Java console-based Mini E-Commerce Cart system.

Users can:
- Add products
- View cart items
- Checkout and see total bill
- Exit the application

## Concepts Used
- Java Classes & Objects
- ArrayList (Collections)
- Menu-driven system
- Loop & Switch case

This project is part of my 15 Days Java Project Challenge 🚀

Author: Yuvraj (Yuvi)
