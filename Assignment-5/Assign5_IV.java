import java.util.Scanner;

public class Assign5_IV {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the three side of Triangle:");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if(a == b && b == c)
        {
            System.out.println("It's an Equilateral Triangle");
        }
        else if(a == b || a == c || b == c)
        {
            System.out.println("It's an Isosceles Triangle");
        }
        else
        {
            System.out.println("It's a Scalene Triangle");
        }
    }
}