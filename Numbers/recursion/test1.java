
class Automorphic {

    static int power(int n) {
        if (n == 0) {
            return 1;
        }
        return 10 * power(n - 1);
    }

    public static void main(String[] args) {

        int n = 25;
        int sq = n * n;

        int digits = String.valueOf(n).length();

        int div = power(digits);

        if (sq % div == n) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
