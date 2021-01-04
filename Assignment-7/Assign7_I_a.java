
/* WAP in Java to print and find the sum of following series:
a) 1+ 1/2 + 1/3 + 1/4 + 1/5 + .. 1/N. Find the sum of this series.*/

import java.util.Scanner;
public class Assign7_I_a{
public static void main(String args[]){
    int num;
    double i,sum=0.00;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the value of N for to this problem 1+ 1/2 + 1/3 + 1/4 + 1/5 + .. 1/N =");
    num=input.nextInt();
    for(i=1;i<=num;i++){
        sum=sum+(1/i);
    }
    System.out.println("Sum is="+sum);


}
}