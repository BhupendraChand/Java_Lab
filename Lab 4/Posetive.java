import java.util.Scanner;
public class Posetive{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your number:");
int a=scanner.nextInt();
if(a>0){
System.out.println("Postive number:");
}else if(a<0){
System.out.println("Negetiv number:");
}else{
System.out.println("Zero");
}


}
}