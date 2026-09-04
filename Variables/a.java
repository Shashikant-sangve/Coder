class  A
{
	public static void main(String[] args) 
	{
		int i = 1;  //local variable
		System.out.println(i);
		A.M1();
		System.out.println(i);
	}
	public static void M1()
		{
		int i = 2;
		System.out.println(i);
	}
}
