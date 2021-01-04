import java.util.Scanner;

public class Assign7_III {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter the Number:");
        num = input.nextInt();
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum:" + sum);
    }
}