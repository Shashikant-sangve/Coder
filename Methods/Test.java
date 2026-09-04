class Test
{
	public static void main(String[]args)
	{
		System.out.println("main start's");
		m1();
		System.out.println("main end's");
	}
	
	public static void m1()
	{
		System.out.println("m1 start's");
		m2();
		System.out.println("m1 end's");
	}

	public static void m2()
	{
		System.out.println("m2 start's");
		System.out.println("m2 end's");
	}
}