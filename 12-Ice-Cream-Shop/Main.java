import java.util.Scanner;

public class IceCreamShop 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int qty;
        int total = 0;

        do 
        {

            System.out.println("---- ICE CREAM SHOP ----");
            System.out.println("1. Cherry Icecream - 45");
            System.out.println("2. Pineapple Icecream - 35");
            System.out.println("3. Vanilla Icecream - 45");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice == 4)
                break;

            System.out.print("Enter quantity: ");
            qty = sc.nextInt();

            int price = 0;

            switch(choice)
            {
                case 1: price = 45; break;
                case 2: price = 35; break;
                case 3: price = 45; break;
            }

            int itemTotal = price * qty;
            total += itemTotal;

            System.out.println("Item Total: " + itemTotal);
            System.out.println("Current Bill: " + total);
            System.out.println();

        } while(true);

        System.out.println("Final Bill = " + total);
    }
}

# Ice Cream Shop Billing System 🍦

This is a simple Java console-based Ice Cream Shop billing system.

The program allows a user to choose different ice cream flavors, enter the quantity, and calculate the total bill.

## Menu

1. Cherry Ice Cream – 45  
2. Pineapple Ice Cream – 35  
3. Vanilla Ice Cream – 45  
4. Exit

## Features

- Displays ice cream menu
- Allows user to select an item
- Accepts quantity of ice cream
- Calculates item total and running bill
- Displays final bill when the user exits

## Concepts Used

- Java Basics
- `Scanner` class for user input
- `switch` statement
- `do-while` loop
- Basic arithmetic operations

  ## Example Output

   ICE CREAM SHOP 

* Cherry Icecream - 45

* Pineapple Icecream - 35

* Vanilla Icecream - 45

- Exit

Enter your choice: 1
Enter quantity: 2
Item Total: 90
Current Bill: 90

Final Bill = 90
