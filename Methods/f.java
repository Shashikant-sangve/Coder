class  F
{
	static int i = 10;
	public static void main(String[] args) 
	{
		F.m1();
		F.i=20;
		F.m1();
	}
	public static void m1()
	{
		System.out.println("m1 starts");
		System.out.println(F.i);
		System.out.println("m1 ends");
	}
}
