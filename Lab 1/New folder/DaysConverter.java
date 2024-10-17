import java.util.*;

public class DaysConverter 
{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        /* Input number of days from user */
        System.out.print("Enter days: ");
        int days = in.nextInt();

        /* Year, weeks and days conversion  */
        int years = (days / 365);
        int weeks = (days % 365) / 7;
            days  = (days % 365) % 7;

        /* Print total years, weeks and remaining days in given days */
        System.out.println("Year/s = " + years);
        System.out.println("Week/s = " + weeks);
        System.out.println("Day/s  = " + days);
    }
}