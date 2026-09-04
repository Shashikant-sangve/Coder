import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int original = n;
		int sum = 0;
		
		int digits = String.valueOf(n).length();
		
		while(n > 0){
			int d = n % 10;
			sum +=Math.pow(d,digits);
			n/=10;
		}
		if(sum != original){
			System.out.println("Non-Armstrong Number");
	}
	else
	{
		System.out.println("Armstrong Number");
	}
}
}

                /*  
                  Enter a num:
                121
                Non-Armstrong Number
                
                C:\Jspider>java ArmstrongNumber
                Enter a num:
                153
                Armstrong Number
				
				*/