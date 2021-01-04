import java.util.Scanner;

abstract class Shape {
    public abstract void Volume();

    double length, breadth, height;

    public void setDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length:");
        length = input.nextDouble();
        System.out.print("Enter the Breadth:");
        breadth = input.nextDouble();
        System.out.print("Enter the Height:");
        height = input.nextDouble();
    }

    public abstract void surfaceArea();

}

class Cube extends Shape {

    double vol, sa;

    @Override
    public void setDetails() {
        // TODO Auto-generated method stub
        super.setDetails();
    }

    public void Volume() {
        vol = length * length * length;
        System.out.println("Volume of Cube: " + vol);
    }

    public void surfaceArea() {
        sa = 6 * length * length;
        System.out.println("Surface Area Of Cube: " + sa);
    }

}

class Cylinder extends Shape {
    double vol, sa;

    @Override
    public void setDetails() {
        // TODO Auto-generated method stub
        super.setDetails();
    }

    public void Volume() {
        vol = 1.414 * (breadth * breadth) * height;
        System.out.println("Volume of Cylinder: " + vol);
    }

    public void surfaceArea() {
        sa = (2 * 1.414 * breadth * height) + (2 * 1.414 * breadth * breadth);
        System.out.println("Surface Area Of Cylinder: " + sa);
    }

}

public class Area {

    public static void main(String[] args) {

        // Shape ob = new Cube();

        Shape obj = new Cube();
        Shape ob = new Cylinder();
        obj.setDetails();
        obj.Volume();
        obj.surfaceArea();
        ob.setDetails();
        ob.Volume();
        ob.surfaceArea();

    }

}