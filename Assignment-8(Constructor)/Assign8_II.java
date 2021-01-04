import java.util.*;

public class Assign8_II {
    public static void main(String[] args) {
        int a, b, n, add, sub, mul;
        double div;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number:");
        a = input.nextInt();
        System.out.print("Enter The Second Number:");
        b = input.nextInt();
        while (true) {
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Exit");
            System.out.print("Enter The Number To Perform The Task:");
            n = input.nextInt();
            switch (n) {
                case 1:
                    add = a + b;
                    System.out.println("A + B = " + add);
                    break;

                case 2:
                    sub = a - b;
                    System.out.println("A - B = " + sub);
                    break;

                case 3:
                    mul = a * b;
                    System.out.println("A * B = " + mul);
                    break;

                case 4:
                    div = a / b;
                    System.out.println("A / B = " + div);
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("The Input Is Wrong");
                    break;
            }
        }
    }
}