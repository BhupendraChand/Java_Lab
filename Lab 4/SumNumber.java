import java.util.*;
 public class SumNumber
{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any integer number:");

int sum=0;
while(true)
{
int num = sc.nextInt();
if(num < 0)
break;
else
sum=sum+num;
}
System.out.println("Sum of  postive integer ="+sum);
}
}
