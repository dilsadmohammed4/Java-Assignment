import java.util.*;

public class Assign6_II {
    public static void main(String args[])
	{
        Scanner input=new Scanner(System.in);
        int number,count=0;
        System.out.println("Enter the Number:");
        number=input.nextInt();
        System.out.println("Result Number Is:"+number);
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println("Totak number of digit:"+count);
	}
}