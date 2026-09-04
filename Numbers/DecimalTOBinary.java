import java.util.Scanner;
class DecimalTOBinary
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int res = 0;
		int i = 1;
		
		while(n>0)
		{
			int bit = n%2;
			res = bit*i+res;
			n/=2;
			i*=10;
		}
		System.out.println(res);
	}
}
        /* 
        Enter a num:
        55
        110111
        
        C:\Jspider>java DecimalTOBinary
        Enter a num:
        61
        111101
        
        */