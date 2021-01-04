import java.util.Scanner;

public class NodeLinkedList {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("1.Insert Node.");
        System.out.println("2.Display.");
        System.out.println("3.Exit.");
        System.out.print("Enter Your Choice:");
        int choice=input.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Enter Number To Insert:");
            int n=input.nextInt();
            push(n);
            break;
            case 2:
            printList();
            break;
            case 3:
            break;
            default:
            System.out.println("Wrong Choice Enter.");
        }

}
}
