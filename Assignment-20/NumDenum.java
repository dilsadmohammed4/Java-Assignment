import java.util.Scanner;

public class NumDenum {
    public void Excep() {
        Scanner input = new Scanner(System.in);
        int num, denum, division;
        System.out.print("Enter Value Of Numerator:");
        num = input.nextInt();
        System.out.print("Enter Value Of Denomerator:");
        denum = input.nextInt();
        try {
            division = num / denum;
            System.out.println("Division Is:" + division);
        } catch (ArithmeticException e) {

            System.out.println("Division is Not Possible When Denominator is zero.");
        }
    }

    public static void main(String[] args) {
        NumDenum n = new NumDenum();
        n.Excep();

    }
}
