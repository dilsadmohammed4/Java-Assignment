import java.util.*;

class ArrayMain {
    int size = 6;
    int array[] = new int[size];

    ArrayMain() {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 6;
        array[5] = 5;
    }

    public void Display() {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void SumAvg() {
        int sum = 0, avg = 0, i;
        for (i = 0; i < size; i++) {
            sum = sum + array[i];
            avg = sum / size;
        }
        System.out.println("Sum Is:" + sum);
        System.out.println("Avarage Is:" + avg);
    }

    public void swapMaxMinArray() {
        int temp, i;
        int max = array[0];
        int min = array[0];
        for (i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("=============");
        System.out.println("Before swap");
        System.out.println("Maximun:" + max);
        System.out.println("Minimum:" + min);
        temp = min;
        min = max;
        max = temp;
        System.out.println("=============");
        System.out.println("After swap");
        System.out.println("Maximun:" + max);
        System.out.println("Minimum:" + min);
        System.out.println("=============");
    }

    public void Occurence() {
        int i, num, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the one Array element to cheak Occurrence:");
        num = input.nextInt();
        for (i = 0; i < size; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        System.out.println("Number Is:" + num);
        System.out.println("Occurrence:" + count + " Times");
    }
}

public class ArrayOperation {
    public static void main(String[] args) {
        ArrayMain z = new ArrayMain();
        z.Display();
        z.SumAvg();
        z.swapMaxMinArray();
        z.Occurence();
    }
}