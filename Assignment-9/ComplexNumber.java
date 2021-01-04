class Complex {
    int real;
    int imag;

    Complex() {

    }

    Complex(int x, int y) {
        real = x;
        imag = y;
    }

    public void showData() {
        System.out.println(real + "+" + imag + "i");
    }

    Complex Add(Complex z) {
        Complex r = new Complex();
        r.real = real + z.real;
        r.imag = imag + z.imag;
        return r;
    }

    Complex Sub(Complex z) {
        Complex r = new Complex();
        r.real = real - z.real;
        r.imag = imag - z.imag;
        return r;
    }

    Complex Mul(Complex z) {
        Complex r = new Complex();
        r.real = real * z.real;
        r.imag = imag * z.imag;
        return r;
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        Complex a1 = new Complex(4, 5);
        Complex a2 = new Complex(9, 10);
        Complex a3 = new Complex();
        System.out.print("First Complex Number:");
        a1.showData();
        System.out.print("Second Complex Number:");
        a2.showData();
        System.out.print("Addition of two Complex Number:");
        a3 = a1.Add(a2);
        a3.showData();
        System.out.print("Subtraction of two Complex Number:");
        a3 = a1.Sub(a2);
        a3.showData();
        System.out.print("Multiplication of two Complex Number:");
        a3 = a1.Mul(a2);
        a3.showData();
    }
}