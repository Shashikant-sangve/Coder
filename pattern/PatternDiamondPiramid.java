class PatternDiamondPiramid
{
	public static void main(String[] args) 
	{
		int n=5;
		int sp = n/2;
		int st = 1;
		char ch='A';
		for(int i=1; i<=n; i++){
			for(int j=1; j<=sp; j++)
			System.out.print("  ");
			for(int k=1; k<=st; k++){
				if(k%2!=0||k==n-1)
		System.out.print(ch+ " ");
			else{
				ch++;
			    
				System.out.print(ch+ "  ");
					
					if(k%2!=0)
		         System.out.print(ch+ " ");
			    else{
				ch--;
			    
				System.out.print(ch+ "  ");
			}	
			
			}
			}
		
		System.out.println();
		if(i<=n/2){
		sp--;
		st+=2;
		// ch++;
		}else{
			sp++;
		st-=2;
		//ch--;
		}}
	}
}


/*

    *
  * * *
* * * * *
  * * *
    *
*/
