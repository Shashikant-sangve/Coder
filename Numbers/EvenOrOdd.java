import java.util.Scanner;
class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		long n=scn.nextLong();
		if(n%2==0) // (OR)  without using arithmetic operator  -> if((n&1)==0)
		{
			System.out.println("even num");
		}
		else
		{
			System.out.println("odd num");
		}
	}
}
