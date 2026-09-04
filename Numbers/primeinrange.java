import java.util.Scanner;

class primeinrange {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            int n = j;
            boolean flag = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (n >= 2 && flag) {
                System.out.print(j + " ");
            }

        }
    }
}

/*
 * 2 3 5 7
 */