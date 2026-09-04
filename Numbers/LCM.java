import java.util.Scanner;
class LCM
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int n=a>b? a:b;
		int i = n;
			while(true)
		{
			if(n%a==0 && n%b==0)
				break;
			n+=i;
		}
		
		System.out.println(n);
	}
}

       /*
       Enter a num:
       25
       5
       25
       
       C:\Jspider>java LCM
       Enter a num:
       3
       10
       30
		
		