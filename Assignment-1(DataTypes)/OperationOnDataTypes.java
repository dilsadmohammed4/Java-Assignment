import java.lang.Math;
public class OperationOnDataTypes {
    public static void main(String[] args) {
        float div,rem;
        int sum,sub,mul,pow;
        int a=15;
        int b=6;
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        rem=a%b;
        System.out.println("Sum="+sum);
        System.out.println("Subtraction="+sub);
        System.out.println("Multiplication="+mul);
        System.out.println("Division="+div);
        System.out.println("Value="+Math.pow(a, b));
        System.out.println("Remainder"+rem);
    }
    
}