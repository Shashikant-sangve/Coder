import java.util.Scanner;
class SumOfDigits  
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum=0;
		while(n > 0){
			sum += n%10;
			n /= 10;
		}
			System.out.println(sum);
	}
}
   /* 
     Enter a num:
     123
     6
     
     C:\Jspider>java SumOfDigits
     Enter a num:
     555
     15
	 
	 */