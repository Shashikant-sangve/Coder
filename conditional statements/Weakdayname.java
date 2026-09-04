import java.util.Scanner;
class  Weakdayname
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter weakday num:  ");
		int d=scn.nextInt();
		
		switch (d) 
			{
			case 1 :System.out.println("Sunday");
				break;
			case 2 : System.out.println("Monday");
				break;
			case 3 : System.out.println("Tuesday");
				break;
			case 4 : System.out.println("Wednesday");
				break;
			case 5 : System.out.println("Thursday");
				break;
			case 6 : System.out.println("Friday");
				break;
			case 7 : System.out.println("Saturday");
				break;
			default : System.out.println("invalid input");
		}
	}
}
     /* C:\Jspider>java   Weakdayname
        Enter weakday num:
        1
        Sunday
        
        C:\Jspider>java   Weakdayname
        Enter weakday num:
        2
        Monday
        
        C:\Jspider>java   Weakdayname
        Enter weakday num:
        3
        Tuesday    */
