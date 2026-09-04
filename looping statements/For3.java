class  For3
{
	public static void main(String[] args) 
	{
		int i = 0;
		for(i=1;i<=10;i++){
			if(i%3==0) break;
		System.out.println("outside loop: ="+i);
	}
}
}

    /*  
	  C:\Jspider>java For3
         outside loop: =1
         outside loop: =2
     */