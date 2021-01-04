
import java.util.*;

class TwoDArray {

    int i, j, n, m = 2;
    int [][] array;
    array=new int[m][n];
    Scanner input = new Scanner(System.in);

    TwoDArray() {
        System.out.print("Enter The Column Size Of Array:");
        n = input.nextInt();
        System.out.print("Enter The Array Element:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = input.nextInt();

            }
        }
    }

    void showData() {
        System.out.println("Array Element Is:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}

class OneDArray {

}

public class MultiArray {
    public static void main(final String[] args) {
        final TwoDArray a1 = new TwoDArray();
        a1.showData();

    }
}

}
