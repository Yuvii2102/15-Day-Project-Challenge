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
