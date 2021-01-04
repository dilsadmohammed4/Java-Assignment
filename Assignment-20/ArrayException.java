import java.util.Scanner;

public class ArrayException {
    public void ExcepClass() {
        Scanner input = new Scanner(System.in);
        int arr[];
        int i, element;
        System.out.print("Enter the Array Range :");
        int n = input.nextInt();
        arr = new int[n];

        System.out.println("Enter The Array Element :");
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Array:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.print("Enter the index of the required Element :");
        try {
            element = input.nextInt();
            System.out.println("Element in the given index is :" + arr[element]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid.");
            System.out.println("Enter In Beetween 0 to " + arr.length + " ");
        }
    }

    public static void main(String[] args) {
        ArrayException a=new ArrayException();
        a.ExcepClass();
    }
}
