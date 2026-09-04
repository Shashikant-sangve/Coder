import java.util.Scanner;
class FibonacciUPtoLimitONLY
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=0, b=1, c=1, d;
		for(; a<=n ;)
		{
		System.out.printf(a+"  ");
		d=a+b+c;
		a=b;
		b=c;
		c=d;
		}
	}
}
/*
Enter a num:
100
0  1  1  2  4  7  13  24  44  81
C:\Jspider>java FibonacciUPtoLimitONLY
Enter a num:
500
0  1  1  2  4  7  13  24  44  81  149  274
*/