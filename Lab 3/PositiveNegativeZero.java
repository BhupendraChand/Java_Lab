
//Write a java program to check Wheather the given number is positive or negative or zero

import java.util.*;

public class PositiveNegativeZero 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number:");
        int k = sc.nextInt();
        if (k > 0) {
            System.out.println("The number you entered is Positive.");
        } else if (k < 0) {
            System.out.println("The number you entered is Negative.");
        } else {
            System.out.println("The number you entered is 0.");
        }
    }
}
