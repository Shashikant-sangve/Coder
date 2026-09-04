class PatternCharDiamond
{
	public static void main(String[] args) 
	{
		int n=5;
		int sp = n/2;
		int st = 1;
		char ch='A';
		for(int i=1; i<=n; i++)
		{
		char b=' ';
			for(int j=1; j<=sp; j++){
			System.out.print("  ");}
			for(int k=1; k<=st; k++){
				if(k<=i){
		System.out.print(ch+" ");
			ch++;}
			
			else{ System.out.print(--b +"  ");}
		b=ch;
		}
		
		System.out.println();
		if(i<=n/2){
		sp--;
		st+=2;
		}else{
			sp++;
		st-=2;
		//ch++;
		
		}
	}
}
}