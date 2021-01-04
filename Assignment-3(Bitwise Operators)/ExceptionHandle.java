public class ExceptionHandle {
    public static void main(String[] args) {
        int a,b,c=0;
        a=8;
        b=0;

        try {
            c=a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("B can not be Zero");
        }
        System.out.println("Sum is "+c);
    }
}
