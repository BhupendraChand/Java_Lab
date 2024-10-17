import java.util.*;
class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= s.nextDouble();
         double  area=22/7*r*r ;
         double  perimeter=2*22/7*r;
         System.out.println("Area of Circle is: " + area);     
         System.out.println("Perimeter of Circle is: " + perimeter);  
   }
}