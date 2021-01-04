
import java.util.Scanner;

public class Assign7_V {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static void printPrime(int m, int n) {
        for (int i = m; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting number:");
        int n = scan.nextInt();
        System.out.print("Enter the Ending Number:");
        int m = scan.nextInt();
        System.out.println("Prime number is:");
        printPrime(n, m);
    }

}