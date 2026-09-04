import java.util.Scanner;
class GCD
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int n=a<b?a:b;
			while(true)
		{
			if(a%n==0 && b%n==0)
				break;
			n--;
		}
		
		System.out.println(n);
	}
}
   /* 
   
			Enter a num:
           77
           56
           7
           
           C:\Jspider>java GCD
           Enter a num:
           88
           40
           8
		   
		   */