import java.util.*;
 public class Natural
{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
int i,sum=0;
for(i=1;i<=num;i++)
{
sum=sum+i;
}
System.out.println("Sum of first"+sum+" natural number is="+sum);
}
}