import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum = 0;
		for(int i=1; i<=n/2; i++){
			if(n%i==0)
			sum+=i;
		
	}
	if(sum==n)
	{
		System.out.println("Perfect number: ");
	}
	else
	{
		System.out.println("Not Perfect number: ");
	}
}
}

      /*
       Enter a num:
      5
      Not Perfect number:
      
      C:\Jspider>java PerfectNumber
      Enter a num:
      6
      Perfect number:
	  
	  */