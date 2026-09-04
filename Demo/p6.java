public class p6 
 {
 p6()
 {
 System.out.println("Welcome");
 }
 p6(String name)
 {
 System.out.println("Welcome "+ name);
 }
 public void add(int a, int b)
 {
 System.out.println("Sum of "+ a +" + "+ b +" = "+ (a+b));
 }
 public void add(double a, double b)
 {
 System.out.println("Sum of "+ a +" + "+ b +" = "+ (a+b));
 }
 public static void main(String[] args) {
 p6 p1 = new p6();
 p6 p2 = new p6("Yogeesh S");
 p1.add(5, 6);
 p1.add(5.2, 6.4);
 }
 }

