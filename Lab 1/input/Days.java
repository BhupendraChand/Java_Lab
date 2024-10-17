public class Days
	{
		public static void main(String[]inp)
			{
				int day=Integer.parseInt(inp[0]);
		int y,w,d;
	y=day/365;
	w=(day%365)/7;
	d=day-(y*365)-(w*7);

		System.out.println("The entered days is equivalent to " +y+ " years " +w+ " week " +d+ " days");
	}
}