import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int original = n;
		int sum = 0;
		while(n>0)
		{
			int digit = n%10;
			
			int fact = 1;
			for (int i=1;i<=digit; i++)
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(sum == original){
			System.out.println("Strong number");
	}
	else
	{
		System.out.println("Not Strong number");
	}
}
}

       /*
        Enter a num:
       145
       Strong number
       
       C:\Jspider>java StrongNumber
       Enter a num:
       153
       Not Strong number
	   
	   */
