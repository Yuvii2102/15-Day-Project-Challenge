import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" PASSWORD STRENGTH CHECKER ");
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        // Length check
        if (password.length() >= 8) {
            score++;
        }

        // Uppercase check
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Lowercase check
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Number check
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Special character check
        if (password.matches(".*[!@#$%^&*()].*")) {
            score++;
        }

        System.out.println("\n RESULT ");

        if (score <= 2) {
            System.out.println("Weak Password, Enter stronger characters ❌");
        } 
        else if (score == 3 || score == 4) {
            System.out.println("Medium Password ⚠");
        } 
        else {
            System.out.println("Strong Password ✅");
        }

        sc.close();
    }
}




        ✅ Sample Output
  
- Example 1:
  Enter your password: yuvi123
  Weak Password ❌
  
- Example 2:
  Enter your password: Yuvi123
  Medium Password ⚠
  
- Example 3:
  Enter your password: Yuvi@123
  Strong Password ✅


# Password Strength Checker 🔐

This Java program checks the strength of a password.

## Features
- Checks minimum length (8 characters)
- Checks uppercase letters
- Checks lowercase letters
- Checks numbers
- Checks special characters
- Classifies password as Weak, Medium, or Strong

## Concepts Used
- Scanner
- String methods
- Regular expressions (regex)
- Conditional statements

This project is part of my Java Mini Project Challenge 🚀
Author: Yuvraj (Yuvi)
  
