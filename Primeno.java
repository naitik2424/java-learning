import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Environment Test ===");
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number. ");
        }

        System.out.println("\nJava is working perfectly in VS Code! 🚀");
        scanner.close();
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 3) return n > 1;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
