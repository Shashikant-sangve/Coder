package Numbers;
import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args) 
	{
		System.out.println("enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int prod=1;
		for(int i=1; i<=n; i++){
			prod*=i;
		}
		System.out.println(prod);
		
	}
}
      /*
            C:\Jspider>java Factorial
            enter a num:
            2
            2
            
            C:\Jspider>java Factorial
            enter a num:
            3
            6
            
            C:\Jspider>java Factorial
            enter a num:
            4
            24
			   */