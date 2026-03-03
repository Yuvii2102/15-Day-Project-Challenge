import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("===== SIMPLE TO-DO LIST =====");

        System.out.print("How many tasks do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();  // clear buffer

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter task " + i + ": ");
            String task = sc.nextLine();
            tasks.add(task);
        }

        System.out.println("\n--- Your Tasks ---");

        for (String task : tasks) {
            System.out.println(task);
        }

        sc.close();
    }
}
 

                # Basic To-Do List 📝

This is a simple Java console-based To-Do List application.

Users can:
- Add tasks
- View tasks
- Remove tasks
- Exit program

Concepts Used:
- ArrayList
- Loop
- Switch case
- User input handling

Part of my Java Mini Project Challenge 🚀
Author: Yuvraj (Yuvi)
