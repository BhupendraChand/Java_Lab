import java.util.*;

public class SquareCube
 {
    public static void main(String [] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num;
        num = sc.nextInt();

        System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
        System.out.println("Cube of " + num + " is: " + Math.pow(num, 3));
   
    }
}