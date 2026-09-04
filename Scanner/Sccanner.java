import java.util.Scanner;
class Sccanner 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
	}
}
