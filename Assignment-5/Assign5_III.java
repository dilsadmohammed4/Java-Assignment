import java.util.Scanner;

public class Assign5_III {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter the value of A=");
        a=input.nextInt();
        System.out.print("Enter the value of B=");
        b=input.nextInt();
        System.out.print("Enter the value of C=");
        c=input.nextInt();
        d=b*b-4*a*c;
        System.out.println("Result="+d);
        if(d<0){
            System.out.println("Root is imaginary");
        }
        else if(d==0){
            System.out.println("Roots are equal so only one root");
        }
        else if(d>0){
            System.out.println("Rational and squared.");
            System.out.println("Rational but not squared.");
        }
    }
}
