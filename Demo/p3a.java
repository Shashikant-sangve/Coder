import java.util.Scanner;
public class p3a
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter circle Radius:");
 double radius=sc.nextDouble();
 System.out.println("Area of circle:" + (Math.PI*radius* radius));
 System.out.println("Circum ference of circle:"+(2*Math.PI* radius));
 }
 }

