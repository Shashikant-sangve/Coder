import java.util.Scanner;

class Emirp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int original = n;
        int rev = 0;

        // Reverse the number
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }

        // Check if original number is prime
        boolean isPrime1 = true;
        if (original <= 1) {
            isPrime1 = false;
        } else {
            for (int i = 2; i <= original / 2; i++) {
                if (original % i == 0) {
                    isPrime1 = false;
                    break;
                }
            }
        }

        // Check if reversed number is prime
        boolean isPrime2 = true;
        if (rev <= 1) {
            isPrime2 = false;
        } else {
            for (int i = 2; i <= rev / 2; i++) {
                if (rev % i == 0) {
                    isPrime2 = false;
                    break;
                }
            }
        }

        // Emirp condition
        if (isPrime1 && isPrime2 && original != rev) {
            System.out.println("Emirp Number");
        } else {
            System.out.println("Not an Emirp Number");
        }
    }
}

/*

Enter a number:
17
Emirp Number

C:\Jspider\pattern>java Emirp
Enter a number:
31
Emirp Number

C:\Jspider\pattern>java Emirp
Enter a number:
12
Not an Emirp Number

*/