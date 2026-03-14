import java.util.HashMap;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<>();

        int choice;

        do {
            System.out.println(" CONTACT MANAGER \n");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) 
            {

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter phone number: ");
                String phone = sc.nextLine();

                contacts.put(name, phone);
                System.out.println("Contact saved!");

            }

            else if (choice == 2) {

                System.out.println(" Contact List\n ");

                for (String name : contacts.keySet()) 
                {
                    System.out.println(name + " : " + contacts.get(name));
                }

            }

            else if (choice == 3) 
            {
                System.out.println("Exiting Contact Manager...");
            }

            else 
            {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}

CONTACT MANAGER 
1. Add Contact
2. View Contacts
3. Exit

Enter choice: 1
Enter name: Yuvi
Enter phone number: 9876543210
Contact saved!
Enter choice: 2

-- Contact List --
Yuvi : 9876543210
    

# Contact Manager 📞

This is a simple Java console-based Contact Manager.

The program allows users to store and view contact details.

## Features

- Add new contacts
- View saved contacts
- Simple menu-driven interface

## Concepts Used

- Java Basics
- HashMap (Collections)
- Scanner class
- Loop and conditional statements

## Example

Users can store names and phone numbers and view them later.

## Author

Yuvraj.R (Yuvi)

Part of my Java Mini Project Challenge 🚀
