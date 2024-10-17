// Java Program to Convert Celsius into Fahrenheit
import java.util.Scanner;

 public class Temperature
{
    
	public static void main(String[] args)
	{
		// declaring avriables
	
        double f,c;  // declaring variables..
        Scanner input = new Scanner(System.in);

        System.out.print("Input value in Celsius: ");
        c = input.nextDouble();  // taking values from user...

		f = (c * 1.8) + 32;  // Calculating value...
		// Printing the result.
		System.out.println("value of temperature in fahrenheit:"+ f);
	
	    
	}
}