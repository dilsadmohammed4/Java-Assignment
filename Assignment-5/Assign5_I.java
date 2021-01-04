import java.util.Scanner;
public class Assign5_I {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Basic salary:");
        int Basic_Salary=input.nextInt();
        double da,hra,Gross_salary;
        if(Basic_Salary<12000){
            da=Basic_Salary*1.15;
            hra=Basic_Salary*0.2;
            Gross_salary=Basic_Salary+da+hra;
            System.out.println("Gross Salary Is="+Gross_salary);
        }
        else{
            da=Basic_Salary*0.9;
            hra=Basic_Salary*0.15;
            Gross_salary=Basic_Salary+da+hra;
            System.out.println("Gross Salary Is="+Gross_salary);
        }
    }

}
