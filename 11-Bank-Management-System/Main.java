import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;  // Initial balance
        int choice;

        do {
            System.out.println("\n BANK MANAGEMENT SYSTEM ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.println("Your Balance: ₹" + balance);
            }

            else if (choice == 2) 
            {
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Money deposited successfully!");
            }

            else if (choice == 3) 
            {
                System.out.print("Enter withdraw amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) 
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            }

            else if (choice == 4) 
            {
                System.out.println("Thank you for banking Yuvi 😎");
            }

            else 
            {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

---

   Sample Output:
      
BANK MANAGEMENT SYSTEM 
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit

Enter choice: 1
Your Balance: ₹5000
  
Enter choice: 2
Enter deposit amount: 1000
Money deposited successfully!
  
Enter choice: 3
Enter withdraw amount: 2000
Please collect your money.

---
  
               # Bank Management System 🏦

This is a simple Java console-based Bank Management System.

Users can:
- Check account balance
- Deposit money
- Withdraw money
- Exit the system

## Concepts Used
- Java Basics
- Scanner class
- Conditional statements
- Loop (menu driven program)

This project simulates basic banking operations.

Author: Yuvraj (Yuvi)

Part of my Java Mini Project Challenge 🚀
