import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int n,p=1;
		System.out.println("Please insert any number: ");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n<=0)
			System.out.println("Invalid number");
		else
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					p=0;
					break;
				}
			}
		if(p!=0)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}
}
