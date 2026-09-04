class For4 
{
	public static void main(String[] args) 
	{
		int i = 0;
		for(i=1; i<=10; i++){
			if(i%3==0)continue;
		System.out.println(i);
		}
		System.out.println("outside loop = "+i);
		
	}
}
    /* 
	 C:\Jspider>java For4
        1
        2
        4
        5
        7
        8
        10
        outside loop = 11
       */