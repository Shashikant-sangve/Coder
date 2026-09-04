// Class to check even or odd
class NumberChecker {
    int number; // Variable to store the number

    // Constructor to initialize the number
    NumberChecker(int number) {
        this.number = number;
    }

    // Method to check if the number is even or odd
    void checkEvenOrOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

// Main class
public class EvenOddExample {
    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker(7); // Create an object with the number 7
        checker.checkEvenOrOdd(); // Check if it's even or odd
    }
}
