import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=0, b=1, c;
		for(int i=1; i<=n; i++)
		{
		System.out.printf(a+"  ");
		c=a+b;
		a=b;
		b=c;
		}
	}
}

         /*
         Enter a num:
         10
         0  1  1  2  3  5  8  13  21  34
         C:\Jspider>java Fibonacci
         Enter a num:
         20
         0  1  1  2  3  5  8  13  21  34  55  89  144  233  377  610  987  1597  2584  4181
         */
