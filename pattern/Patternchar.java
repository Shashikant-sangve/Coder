class Patternchar {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print spaces (left alignment)
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Left side: A ? increasing letters
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j) + " ");
            }

            // Right side: decreasing letters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(64 + j) + " ");
            }

            System.out.println();
        }
    }
}