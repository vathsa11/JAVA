import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int n1=0,n2=1,n,l;
		System.out.println("Enter the number of terms: ");
		Scanner f=new Scanner(System.in);
		l=f.nextInt();
		if(l==1)
			System.out.println(n1);
		else if(l==2)
			System.out.println(n1+" "+n2);
		else
		{
			System.out.print(n1+" "+n2+" ");
			for(int i=3;i<=l;i++)
			{
				n=n1+n2;
				n1=n2;
				n2=n;
				System.out.print(n+" ");
			}
		}
	}
}
