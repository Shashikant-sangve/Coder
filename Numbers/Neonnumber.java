import java.util.Scanner;
class Neonnumber  // Only 3 Neon numbers exist up to infinity.
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sqr=n*n;
		int sum=0;
		while(sqr > 0){
			sum += (sqr)%10;
			sqr/= 10;
		}
			System.out.println(sum==n?"neon number":"non neon number");
	}
}

            /*
            Enter a num:
            1
            neon number
            
            C:\Jspider>java Neonnumber
            Enter a num:
            0
            neon number
            
            C:\Jspider>java Neonnumber
            Enter a num:
            9
            neon number
            
            C:\Jspider>java Neonnumber
            Enter a num:
            123
            non neon number
			*/
