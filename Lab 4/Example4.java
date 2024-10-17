import java.util.*;
 
public class Example4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any value");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int largest=(a<b)?(b<c?c:b):(a<c?c:a);
System.out.println("the largest value of the three="+largest);
}
}
