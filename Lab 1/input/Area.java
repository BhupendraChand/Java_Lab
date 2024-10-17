public class Area
	{
		public static void main (String[]args)
		   {
			float length,breadth,area,perimeter;

				length=Float.parseFloat(args[0]);
				breadth=Float.parseFloat(args[1]);

			area=length*breadth;
			perimeter=(2*length)+(2*breadth);

		System.out.println("The area of the rectangle is "+area+" and perimeter is "+perimeter);
	}
}