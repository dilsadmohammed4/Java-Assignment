import java.util.Scanner;

public class Assign7_I_d {
    public static void main(String[] args) {
        int i,num;
        double sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of N:");
        num=input.nextInt();
        System.out.print("Series is: ");
        for(i=1;i<=num;i++){
            if(i==1){
                System.out.print("1");
            }
            else if(i%2==0){
                System.out.print(" + "+i+"^"+"3");
            }
            else{
                System.out.println(" + "+i+"^"+"2");
            }
        }
        for(i=1;i<=num;i++){
            if(i%2==0){
                sum=sum+Math.pow(i,3);
            }
            else{
                sum=sum+Math.pow(i,2);
            }
        }
        System.out.println("Sum="+sum);
    }
}