class swap
{
       public static void main(String[] arg)
{
        int a=10;
	int b=20;

	System.out.println("Before swaping");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
  
	int c=0;
	c=b;
	b=a;
	a=c;

        System.out.println("After swaping");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
   }
}