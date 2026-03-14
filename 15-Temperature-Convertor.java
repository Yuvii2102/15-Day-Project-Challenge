import java.util.Scanner;

public class Main
  {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int choice;
        double temp;
        double result;

        System.out.println("  TEMPERATURE CONVERTER ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        if (choice == 1) 
        {

            System.out.print("Enter temperature in Celsius: ");
            temp = sc.nextDouble();

            result = (temp * 9/5) + 32;

            System.out.println("Temperature in Fahrenheit: " + result);

        }

        else if (choice == 2) 
        {

            System.out.print("Enter temperature in Fahrenheit: ");
            temp = sc.nextDouble();

            result = (temp - 32) * 5/9;

            System.out.println("Temperature in Celsius: " + result);

        }

        else 
        {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
