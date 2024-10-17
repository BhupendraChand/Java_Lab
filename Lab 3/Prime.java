import java.util.*;
 public class Prime
{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to check:");
int num=sc.nextInt();
 int i,count=0;
  for(i=1;i<=num;i++)
{
    if (num%i==0)
   {
count++;
   }
}

if(count==2)
{
      System.out.println(num + " is a prime number.");
}
    else
{
      System.out.println(num + " is not a prime number.");
  
}
}
}