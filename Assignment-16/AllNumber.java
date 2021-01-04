
//package world;
import java.util.Scanner;

class Number {
    int[] arr;

    Number(int n) {

        Scanner input = new Scanner(System.in);
        arr = new int[n];
        System.out.println("Enter " + n + " Numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
    }

    public void showNumber() {
        System.out.println("Array " + arr.length + "Elements Are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class OddNum extends Number {
    int OddArry[];

    OddNum(int n) {
        super(n);
        n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                n++;
            }
        }
        OddArry = new int[n];
        for (int i = 0; i < n; i++) {
            OddArry[i] = 0;

        }
        CopyOdd();
    }

    public void CopyOdd() {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                OddArry[j++] = arr[i];
            }
        }
    }

    public void ShowOdd() {
        System.out.println("There are" + OddArry.length + " Odd Numbers:");
        for (int i = 0; i < OddArry.length; i++) {
            System.out.println(OddArry[i] + " ");
        }
    }
}

class PrimeNum extends OddNum {

    int PrimeArr[];

    PrimeNum(int n) {
        super(n);
        n = 0;
        for (int i = 0; i < OddArry.length; i++) {
            if (OddArry[i] % 5 == 0) {
                n++;
            }
            PrimeArr = new int[n];
            for (i = 0; i < n; i++) {
                PrimeArr[i] = 0;
            }
        }
    }

    public void CopyPrime() {
        int j = 0;
        for (int i = 0; i < OddArry.length; i++) {
            if (OddArry[i] % 5 == 0) {
                PrimeArr[j++] = OddArry[i];
            }
        }
    }

    public void showPrime() {
        System.out.println("There are " + PrimeArr.length + " Prime Number:");
        for (int i = 0; i < PrimeArr.length; i++) {
            System.out.println(PrimeArr[i] + " ");
        }
    }
}

public class AllNumber {
    public static void main(String[] args) {
        // int n;
        // System.out.print("Enter The Array Size:");
        // Scanner input = new Scanner(System.in);
        // n = input.nextInt();
        PrimeNum obj = new PrimeNum(6);
        // obj.CopyPrime();
        obj.showNumber();
        obj.ShowOdd();
        // obj.ShowOdd();
        // obj.showPrime();

    }
}
