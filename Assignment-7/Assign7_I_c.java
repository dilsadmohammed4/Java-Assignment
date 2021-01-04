
/* c) 1 + 1/2! + 1/3!+....... +1/n!. Also find the sum. */

import java.util.Scanner;

public class Assign7_I_c {
    static int factorial(int num)
    {
        int i,fac = 1;
        for (i = 2; i <= num; i++)
        fac=fac*i;
        return fac;
    }
    static double sum(int num)
    {
        double sum =0;
        int i;
        for (i=1; i <=num; i++)
            sum += 1.0/factorial(i);
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter the value of N:");
        num=input.nextInt();
        double l=sum(num);
        System.out.println("Sum is="+l);

    }
}