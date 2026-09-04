import java.util.Scanner;

class smallautomorphicnorange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = scn.nextInt();
        for (int j = 1; j <= n; j++) {
            int square = j * j;
            int temp = j;
            boolean isAutomorphic = true;
            while (temp > 0) {
                if (temp % 10 != square % 10) {
                    isAutomorphic = false;
                    break;
                }
                temp /= 10;
                square /= 10;
            }
            if (isAutomorphic) {
                System.out.print(j + " ");
            }
        }
    }
}

/*
 * 
 * Enter range:
 * 20
 * 1 5 6
 * 
 */