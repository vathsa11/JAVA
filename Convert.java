import java.util.Scanner;

public class Convert
{
	static long days(long d)
	{
		return d%365;
	}
	static long years(long d)
	{ 
		return d/365;
	}
	public static void main(String[] args)
	{
			System.out.println("Input the number of minutes:");
			Scanner in=new Scanner(System.in);
			long min=in.nextLong();
			long d=min/1440;
			long dy=days(d);
			long yr=years(d);			
			System.out.println(min+" minutes is approximately "+yr+" years and "+dy+" days");
	}
}
