
/*
b) 1 + 1/x + 1/x2 + 1/x3+.......+1/xn Find the sum of this series.*/

import java.util.Scanner;
import java.lang.Math;
public class Assign7_I_b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,x;
        double i,sum=0.00;
        System.out.print("Enter the terms N:");
        num=input.nextInt();
        System.out.print("Enter the value of x:");
        x=input.nextInt();
        for(i=1; i<=num; i++){
            sum += 1+(1/Math.pow(x,i));
        }
        System.out.println("Sum="+sum);
    }
}