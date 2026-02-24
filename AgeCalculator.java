import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator 
{
     public static void main(String[] args) 
  {

        Scanner sc = new Scanner(System.in);

        System.out.println("AGE CALCULATOR");

        System.out.print("Enter your birth year (YYYY): ");
        int year = sc.nextInt();

        System.out.print("Enter your birth month (MM): ");
        int month = sc.nextInt();

        System.out.print("Enter your birth day (DD): ");
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        if (birthDate.isAfter(currentDate)) 
        {
            System.out.println("Invalid Date of Birth! It is in the future.");
        } 
        else 
        {
            Period age = Period.between(birthDate, currentDate);

            System.out.println("\n YOUR AGE ");
            System.out.println("Years  : " + age.getYears());
            System.out.println("Months : " + age.getMonths());
            System.out.println("Days   : " + age.getDays());
        }
    
        sc.close();
    }
}





/* Java Age Calculator 🎂

This is a simple Java console application that calculates age based on the user's date of birth.

---

# Features

- Takes user input (Year, Month, Day)
- Uses Java `LocalDate` and `Period`
- Validates future dates
- Displays age in Years, Months, and Days */
