import java.util.Scanner;                                                           // using switch case
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First number:");
        int a = sc.nextInt();
        
        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        
        System.out.println("Enter operator(+,-,*,/):");
        char op = sc.next().charAt(0);
        
        switch(op)
        {
        
        case '+' : System.out.println("Result="+(a+b));
         break;
         
        case '-' : System.out.println("Result="+(a-b));
         break;
        
       case '*' : System.out.println("Result="+(a*b));
         break;
       
       case '/' : System.out.println("Result="+(a/b));
         break;
         
       default : System.out.println("Invalid operator");
            
        }
    }
}
       
