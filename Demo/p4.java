public class p4 {
    public static void main(String[] args) {
        try
        {
            int a=5,b=0;
            System.out.println("Quotient:"+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("number cant be divided by zero");
        }
        }
    }
