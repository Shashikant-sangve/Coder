class PatternNum3
{
	public static void main(String[] args) 
	{
		int n=5;
		int sp=0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++){
		System.out.print("  ");
			}
		for(int k=i; k<=n; k++){
		System.out.print(k+" ");
		}
		System.out.println();
		sp++;
	}

}
}

/*

1 2 3 4 5
  2 3 4 5
    3 4 5
      4 5
        5
*/