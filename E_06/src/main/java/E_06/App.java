package E_06;



import java.util.Calendar;
import java.util.Scanner;

/**
 * Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.
 *
 * Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.
 *Again, be sure to convert the input to numerical data before doing any math.
 *
 * Don’t hard-code the current year into your program. Get it from the system time via your programming language.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Enter your current age: ");

        int age = Integer.parseInt(reader.nextLine());

        System.out.print("At what age would you like to retire: ");

        int retireage = Integer.parseInt(reader.nextLine());

        System.out.printf("You have %d years until you can retire%n", retireage-age);
        System.out.printf("It is currently %d you can retire in %d", year,year+(retireage-age));

    }
}
