import java.util.Scanner;
class  Leapyear
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter year: ");
		int y=scn.nextInt();
		
		if((y%400==0) || (y%4==0 && y%100!=0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}
}
			 /*  C:\Jspider>java  Leapyear
			Enter year:
			2112
			Leap year

			C:\Jspider>java  Leapyear
			Enter year:
			2111
			not leap year

			C:\Jspider>java  Leapyear
			Enter year:
			2100
			not leap year