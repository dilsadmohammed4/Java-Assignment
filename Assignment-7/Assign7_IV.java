import java.util.Scanner;

public class Assign7_IV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number:");
        int a = input.nextInt();
        numberOfProducts(a);

    }

    public static void numberOfProducts(int n) {
        int product = 1;

        while (n != 0) {
            if(n%10==0){
            product = product * (n % 10);
            n = n / 10;
        }
    }
        if (product > 10) {
            System.out.println("Intermediate result=" + product);
            numberOfProducts(product);
        } else
            System.out.println("Final 1 digit product=" + product);
    }
}