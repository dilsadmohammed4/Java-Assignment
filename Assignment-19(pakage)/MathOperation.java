package mathop;

import java.util.Scanner;

public class MathOperation {

    public static void Max_Min(int arr[]) {

        
        int  i, max, min;
        max = arr[0];
        min = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {

                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Max=" + max);
        System.out.println("Min=" + min);
    }

}
