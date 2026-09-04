class  A
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		A a1;
		a1 = new A();
		System.out.println(a1,i);
		a1.i=10;
		System.out.println(a1.i);
	}
}
