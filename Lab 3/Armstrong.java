//Write a java program to find the input number is armstrong or not
import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Please enter any number:");
     int k=sc.nextInt();
        int number =k, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}