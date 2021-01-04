import mathop.MathOperation;
import statop.StatsOperation;
import java.util.*;

public class MathStats {

    public static void main(String[] args) {
        int arr[];
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Range:");
        int n = input.nextInt();
        arr = new int[n];
        System.out.println("Enter Array Element:");
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        MathOperation.Max_Min(arr);
        StatsOperation s = new StatsOperation();
        s.Avg_Median(arr);
    }
}
