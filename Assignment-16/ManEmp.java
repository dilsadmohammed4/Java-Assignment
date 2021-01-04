import java.util.Scanner;

class Employee {

    private int id, salary;
    private String name, Dept;
    int sal;

    public void Accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Id:");
        id = input.nextInt();
        System.out.print("Enter the Name:");
        name = input.next();
        System.out.print("Enter Department Name:");
        Dept = input.next();
        System.out.print("Enter Salary:");
        salary = input.nextInt();
        sal = salary;

    }

    public void Display() {

        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + Dept);
        System.out.println("Salary: " + salary);
    }
}

class Maneger extends Employee {

    private int bonus, total;

    public void Accept() {
        Scanner input = new Scanner(System.in);
        super.Accept();
        System.out.print("Enter the Bonus:");
        bonus = input.nextInt();
    }

    public void Display() {

        total = bonus + super.sal;
        super.Display();
        System.out.println("Bonus: " + total);
    }
}

public class ManEmp {
    public static void main(String[] args) {
        Maneger n = new Maneger();
        n.Accept();
        System.out.println("=================");
        n.Display();
    }
}
