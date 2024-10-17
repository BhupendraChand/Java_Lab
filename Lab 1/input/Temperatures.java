public class Temperatures
{
public static void main (String [] args)
{
float C,F;
C=Float.parseFloat (args[0]);
F=(C*9/5)+32;
System.out.println ("Fahrenheit degree =" +F);
}
}