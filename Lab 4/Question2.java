import java.util.*;
public class Question2
{
public static void main (String[]args)
{
Scanner Sc=new scanner(System.in);
System.out.println("Enter any number:");
int num = sc.nextInt();
if (num%2!=0)
{
if (num%3!==0)
System.out.println("given number is odd & divisible by 3");
}
System.out.println("end of the program");
}
}