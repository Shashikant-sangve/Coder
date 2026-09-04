import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int s=n*n;
		boolean flag=true;
		while(n>0)
		{
			if((n%10)!=(s%10))
			{
				flag=false;
				break;
			}
			n/=10;
			s/=10;
		}
		if(n==0 && flag)
		{
			System.out.println(" Automorphic Number ");
		}
		else
		{
			System.out.println("Not a Automorphic Number ");
		}
	}
}


          /*
           Enter a num:
          5
           Automorphic Number
          
          C:\Jspider>java AutomorphicNumber
          Enter a num:
          76
           Automorphic Number
          
          C:\Jspider>java AutomorphicNumber
          Enter a num:
          7
          Not a Automorphic Number
		  
		  */
