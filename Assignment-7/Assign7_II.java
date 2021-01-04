public class Assign7_II {

    public static void main(String args[]) {
        int i, first, second;
        int number, sum = 0;
        for (i = 1000; i < 10000; i++) {
            first = i % 100;
            second = i / 100;
            sum = first + second;
            number = sum * sum;
            if (number == i) {
                System.out.println(first + " + " + second + " = " + sum);
                System.out.println("Square of the " + sum + " is = " + number);
            }
        }
    }
}