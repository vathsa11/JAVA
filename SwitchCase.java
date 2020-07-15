import java.util.Scanner;

public class SwitchCase
{
	public static void main(String[] args)
	{
		int fd;
		System.out.println("--Welcome to Hotel MTR--");
		System.out.println("Please select a food item from the menu:\n");
		System.out.println("--TODAY'S MENU--\n1.Bisibelebath\n2.Puliyogare\n3.Idly\n4.Vada\n5.Dosa\n");
		Scanner ch=new Scanner(System.in);
		fd=ch.nextInt();
		switch(fd)
		{
			case 1: System.out.println("Food Item : Bisibelebath\nPrice : Rs.59/-");
					break;
			case 2: System.out.println("Food Item : Puliyogare\nPrice : Rs.39/-");
					break;
			case 3: System.out.println("Food Item : Idly\nPrice : Rs.29/-");
					break;
			case 4: System.out.println("Food Item : Vada\nPrice : Rs.19/-");
					break;
			case 5: System.out.println("Food Item : Dosa\nPrice : Rs.49/-");
					break;
			default: System.out.println("Please enter a valid choice!");
		}
	}
}
