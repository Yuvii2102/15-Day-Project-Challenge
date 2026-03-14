import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
  {

        Scanner sc = new Scanner(System.in);

        int carChoice;
        int days;
        int price = 0;

        System.out.println(" CAR RENTAL SYSTEM ");

        System.out.println("1. Swift - ₹2000 per day");
        System.out.println("2. Innova - ₹4000 per day");
        System.out.println("3. BMW - ₹8000 per day");

        System.out.print("Choose a car (1-3): ");
        carChoice = sc.nextInt();

        System.out.print("Enter number of days: ");
        days = sc.nextInt();

        if (carChoice == 1) 
        {
            price = 2000 * days;
        }
        else if (carChoice == 2) 
        {
            price = 4000 * days;
        }
        else if (carChoice == 3) 
        {
            price = 8000 * days;
        }
        else
        {
            System.out.println("Invalid car choice");
            return;
        }

        System.out.println("Total Rental Price: ₹" + price);

        sc.close();
    }
}


# Car Rental System 🚗

This is a simple Java console-based Car Rental System.

Users can select a car and enter the number of rental days to calculate the total price.

## Available Cars
1. Swift – ₹2000 per day
2. Innova – ₹4000 per day
3. BMW – ₹8000 per day

## Features
- Select a car
- Enter rental days
- Calculate total cost

## Concepts Used
- Java Basics
- Scanner class
- Conditional statements
- Arithmetic operations

Author: Yuvraj (Yuvi)

Part of my Java Mini Project Challenge 🚀
