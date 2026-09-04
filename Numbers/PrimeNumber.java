import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean flag=true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(n>=2 && flag)
		{
			System.out.println("Prime num:");
		}
		else
		{
			System.out.println("Not a Prime num:");
			
		}
	}
}

       /*
       
       Enter a num:
       9
       Not a Prime num:
       
       C:\Jspider>
       C:\Jspider>java PrimeNumber
       Enter a num:
       13
       Prime num:
	   
	   */
		