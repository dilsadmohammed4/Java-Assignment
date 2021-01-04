
import java.util.Scanner;

class Person {

    Scanner input = new Scanner(System.in);
    private int id;
    private String name, year_of_join;

    public void SetPersonData() {
        System.out.print("Enter Name:");
        name = input.nextLine();
        System.out.print("Enter Id:");
        id = input.nextInt();
        System.out.print("Enter Year Of Join:");
        year_of_join = input.next();
    }

    public void showPersonData() {
        System.out.println("=================");
        System.out.println("Name:" + name);
        System.out.println("Id:" + id);
        System.out.println("Year Of Join:" + year_of_join);
    }

}

class Teacher extends Person {
    private double basic, DA, HRA, EPF, net_salary, gross_salary;
    private String sub_Taught;

    public void SetTeacherData() {
        System.out.print("Enter Basic Salary:");
        basic = input.nextDouble();
        System.out.print("Enter the Taught Subject:");
        sub_Taught = input.next();
    }

    public void ShowTeacherData() {
        HRA = basic * 15 / 100;
        DA = basic * 110 / 100;
        EPF = basic * 12 / 100;
        gross_salary = basic + DA + HRA;
        net_salary = gross_salary + EPF;
        System.out.println("Basic Salary:" + basic);
        System.out.println("Subject Taught:" + sub_Taught);
        System.out.println("Net Salary:" + net_salary);

    }
}

class Student extends Person {
    private int fees_per_sem, course_duration;
    private double total_fee;
    private String course;

    public void SetStudentData() {
        System.out.print("Enter Fees Per Sem:");
        fees_per_sem = input.nextInt();
        System.out.print("Enter Course:");
        course = input.next();
        System.out.print("Enter Course Duration in Year:");
        course_duration = input.nextInt();
    }

    public void showStudentData() {
        total_fee = fees_per_sem * (2 * course_duration);
        System.out.println("Fees Per Sem:" + fees_per_sem);
        System.out.println("Course:" + course);
        System.out.println("Course Duration:" + course_duration);
        System.out.println("Total Fees:" + total_fee);
    }

}

public class Annual {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        Student s = new Student();
        System.out.println("=====Enter Employee Details======");
        obj.SetPersonData();
        obj.SetTeacherData();
        System.out.println("========Enter Student Data=======");
        s.SetPersonData();
        s.SetStudentData();
        System.out.println("=================");
        obj.showPersonData();
        obj.ShowTeacherData();
        System.out.println("=================");
        s.showPersonData();
        s.showStudentData();
    }
}
