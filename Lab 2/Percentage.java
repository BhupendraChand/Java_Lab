import java.util.*;
// to find percentage and average of 5 subjects
 public class Percentage
{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks in Statistics:");
        int m=scanner.nextInt();
        System.out.println("Enter marks in SAD:");
        int s=scanner.nextInt();
        System.out.println("Enter marks in WebTechnology:");
        int w=scanner.nextInt();
	  System.out.println("Enter marks in DSA:");
        int d=scanner.nextInt();
        System.out.println("Enter marks in Java:");
        int j=scanner.nextInt();
	float avg=(m+s+w+d+j)/5;
float per=((m+s+w+d+j)*100/500);
        System.out.println("the average is:"+avg);
 System.out.println("the percentage is:"+per);
    }
}