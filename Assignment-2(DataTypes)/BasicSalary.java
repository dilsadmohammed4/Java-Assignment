public class BasicSalary {
    public static void main(String[] args) {
        String name="Ankit Sahoo";
        System.out.println("Employee Name:"+name);
        int Basic_Salary=50000;
        double da,hra,pf,Gross_salary,Net_salary;
        da=Basic_Salary*0.15;
        hra=Basic_Salary*1.1;
        pf=Basic_Salary*0.12;
        Gross_salary=Basic_Salary+da+hra;
        Net_salary=Gross_salary-pf;
        System.out.println("Gross Salary Is="+Gross_salary);
        System.out.println("Net Salary Is:"+Net_salary);
    }
    
}
