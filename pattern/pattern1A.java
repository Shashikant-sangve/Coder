class pattern1A
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k=1;
		char ch='A';
		for (int i=1;i<=n; i++){
			for(int j=1;j<=n;j++)
			{
			if (i%2!=0)
			{
		     System.out.print(k+"   ");
			 k++;
			}
			else{
				System.out.print(ch+"   ");
				ch++;
			}
			}
			 System.out.println();
		
		}
	}
}
		
	

