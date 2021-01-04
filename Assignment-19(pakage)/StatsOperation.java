package statop;

import java.util.*;
import mathop.MathOperation;

public class StatsOperation {

    public static void Avg_Median(int arr[]) {

        double sum = 0.0, avg;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.println();
        System.out.println("Average=" + avg);
    }

}
