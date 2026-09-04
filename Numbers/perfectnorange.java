import java.util.Scanner;

class PerfectNoRange {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter range: ");
        int n = scn.nextInt();

        for (int j = 1; j <= n; j++) {

            int sum = 0;

            for (int i = 1; i <= j / 2; i++) {

                if (j % i == 0) {
                    sum += i;
                }
            }

            if (sum == j) {
                System.out.print(j + " ");
            }
        }

    }
}
/*
 * Enter range:
 * 100
 * 6 28
 */