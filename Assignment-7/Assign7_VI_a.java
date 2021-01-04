public class Assign7_VI_a {
    public static void main(String args[]) {
        int i = 1, j = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                int m = i + j;
                if (i == j || m == 6)
                    System.out.print("1\t");
                else
                    System.out.print("0\t");
            }
            System.out.println();
        }
    }
}