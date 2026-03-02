import java.util.ArrayList;
import java.util.Scanner;

class Expense 
{
    String title;
    double amount;

    Expense(String title, double amount) 
  {
      
        this.title = title;
        this.amount = amount;
    }
}

public class Main 
{

    public static void main(String[] args) 
  {

        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        int choice;
        double total;

        do
          {
            System.out.println("\n EXPENSE TRACKER");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter expense title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    expenses.add(new Expense(title, amount));
                    System.out.println("Expense added!");
                    break;

                case 2:
                    total = 0;
                    System.out.println("\n Your Expenses ");

                    for (Expense e : expenses) {
                        System.out.println(e.title + " - ₹" + e.amount);
                        total += e.amount;
                    }

                    System.out.println("Total Expenses: ₹" + total);
                    break;

                case 3:
                    System.out.println("Goodbye Yuvi 😎");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}


               # Expense Tracker 💰

This is a simple Java console-based Expense Tracker.

Users can:
- Add expenses
- View all expenses
- See total spending

Concepts Used:
- Classes & Objects
- ArrayList
- Loop & Switch case
- Basic arithmetic

Part of my Java Mini Project Challenge 🚀
Author: Yuvraj (Yuvi)
  

              # Sample Output

EXPENSE TRACKER 
1. Add Expense
2. View Expenses
3. Exit
Enter choice: 1
Enter expense title: Food
Enter amount: 250
Expense added!
Enter choice: 2

--- Your Expenses ---
Food - ₹250.0
Total Expenses: ₹250.0
