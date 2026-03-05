import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
  {

        Scanner sc = new Scanner(System.in);

        System.out.println(" CAR RENTAL SYSTEM ");

        System.out.println("Available Cars:");
        System.out.println("1. Swift - ₹2000 per day");
        System.out.println("2. Innova - ₹4000 per day");
        System.out.println("3. BMW - ₹8000 per day");

        System.out.print("Choose a car (1-3): ");
        int car = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int price = 0;

        if (car == 1) 
        {
            price = 2000 * days;
        }
        else if (car == 2) 
        {
            price = 4000 * days;
        }
        else if (car == 3) 
        {
          price = 8000 * days;
        }
        else 
        {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("Total Rental Price: ₹" + price);

        sc.close();
    }
}
