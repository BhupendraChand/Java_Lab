import java.util.Scanner;
public class Even{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your number:");
int a=scanner.nextInt();
if(a%2==0){
System.out.println("Even number");
if(a%3==0){
System.out.println("Divisible by three");
}
}else{
System.out.println("Odd Number");
}


}
}