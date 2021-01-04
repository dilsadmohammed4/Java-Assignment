class Fraction {
    int num, denum;

    public Fraction() {
        num = 0;
        denum = 1;
    }

    public Fraction(int n) {
        num = n;
        denum = 1;
    }

    public Fraction(int p, int q) {
        num = p;
        denum = q;
        Reduce();
    }

    public Fraction(Fraction other) {
        num = other.num;
        denum = other.denum;
    }

    Fraction Add(Fraction f1) {
        Fraction d = new Fraction();
        d.num = (num * f1.denum) + (f1.num * denum);
        d.denum = denum * f1.denum;
        return d;
    }

    Fraction Sub(Fraction f1) {
        Fraction d = new Fraction();
        d.num = (num * f1.denum) - (f1.num * denum);
        d.denum = denum * f1.denum;
        return d;
    }

    Fraction Mul(Fraction f1) {
        Fraction d = new Fraction();
        d.num = num * f1.num;
        d.denum = denum * f1.denum;
        return d;
    }

    Fraction Div(Fraction f1) {
        Fraction d = new Fraction();
        d.num = num * f1.denum;
        d.denum = denum * f1.num;
        return d;
    }

    public void showFraction() {
        System.out.println(num + "/" + denum);
    }

    private void Reduce() {
        int n, d, largest;
        n = num;
        d = denum;
        largest = 1;
        if (n > d) {
            largest = n;
        } else {
            largest = d;
        }
        int gcd = 0;
        for (int i = largest; i >= 2; i--) {
            if (num % i == 0 && denum % i == 0) {
                gcd = i;
                break;
            }
        }
        if (gcd != 0) {
            num = num / gcd;
            denum = denum / gcd;
        }
    }
}

public class FractionDemo {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 3);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction();
        System.out.print("Fraction 1= ");
        f1.showFraction();
        System.out.print("Fraction 2= ");
        f2.showFraction();
        System.out.print("Fraction 1 & 2 Addition: ");
        f3 = f1.Add(f2);
        f3.showFraction();
        System.out.print("Fraction 1 & 2 Subtraction: ");
        f3 = f1.Sub(f2);
        f3.showFraction();
        System.out.print("Fraction 1 & 2 Multiplication: ");
        f3 = f1.Mul(f2);
        f3.showFraction();
        System.out.print("Fraction 1 & 2 Division: ");
        f3 = f1.Div(f2);
        f3.showFraction();
    }
}
