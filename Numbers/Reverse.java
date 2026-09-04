import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int m=0;
		while(n>0)
		{
			m=(m*10)+(n%10);
				n/=10;
		}
		System.out.println(m);
	
	}
}


      /*  
      
      Enter a num:
      12345
      54321
	  
	  */