import java.util.Scanner;


public class Assign5_V {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name1,name2;
        int roll,total;
        double percentage;
        int sub1,sub2,sub3,sub4,sub5;
        System.out.println("==========STUDENT DATA INPUT===========");
        System.out.print("Enter the Roll Number:");
        roll=input.nextInt();
        System.out.print("Enter the Student First Name:");
        name1=input.next();
        System.out.print("Enter the Student Last Name:");
        name2=input.next();
        System.out.println("Enter the 5 Subject mark=");
        sub1=input.nextInt();
        sub2=input.nextInt();
        sub3=input.nextInt();
        sub4=input.nextInt();
        sub5=input.nextInt();
        total=sub1+sub2+sub3+sub4+sub5;
        percentage=(total/500.00)*100;

        if(sub1<=100 && sub2<=100 && sub3<=100 && sub4<=100 && sub5<=100){
                System.out.println("==========STUDENT INFORMATION===========");
                System.out.println("Roll="+roll);
                System.out.println("Name="+name1+" "+name2);
                System.out.println("Total Mark="+total);
                System.out.println("Percentage="+percentage);
                if(percentage>=90 && percentage<=100){
                    System.out.println("Grade-O");
                }
                else if(percentage>=80 && percentage<90){
                    System.out.println("Grade-E");
                }
                else if(percentage>=70 && percentage<80){
                    System.out.println("Grade-A");
                }
                else if(percentage>=60 && percentage<70){
                    System.out.println("Grade-B");
                }
                else if(percentage>=50 && percentage<60){
                    System.out.println("Grade-C");
                }
                else if(percentage>=40 && percentage<50){
                    System.out.println("Grade-D");
                }
                else if(percentage<40){
                    System.out.println("Fail");
                }

        }
        else{
            System.out.println("Plese entered the mark below or equal to hundred.");
        }
        System.out.println("==========*******************===========");
    }
}
