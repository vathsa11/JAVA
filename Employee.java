import java.util.Scanner;

public class Employee
{
	String name[]=new String[10];
	String adr[]=new String[10];
	Integer yr[]=new Integer[10];
	void inputdata(int n)
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter your name: ");
			name[i]=in.next();
			System.out.println("Enter the year of joining: ");
			yr[i]=in.nextInt();
			System.out.println("Enter your residential address: ");
			adr[i]=in.next();
		}
	}
	void displaydata(int n)
	{
		System.out.println("Name \t\t Year of joining \tAddress");
		for(int i=0;i<n;i++)
		System.out.println(name[i]+"\t\t\t"+yr[i]+"\t\t"+adr[i]);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number of employees: ");
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		Employee emp=new Employee();
			emp.inputdata(n);
			emp.displaydata(n);
	}
}
