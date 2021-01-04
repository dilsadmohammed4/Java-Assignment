//package worldtour;
import java.util.Scanner;
import java.lang.*;

class Vehicle {

    Scanner input = new Scanner(System.in);

    private String brandName, country_Of_Origin;
    private double base_Price;

    public void input() {
        System.out.print("Enter Brand Name:");
        brandName = input.nextLine();
        System.out.print("Enter Country Of Origin:");
        country_Of_Origin = input.nextLine();
        System.out.print("Enter Base Price:");
        base_Price = input.nextDouble();
    }

    public void display() {
        System.out.println("=======================");
        System.out.println("Brand:" + brandName);
        System.out.println("Country Origin:" + country_Of_Origin);
        System.out.println("Base Price:" + base_Price);
    }

    public double BasePrice() {
        return base_Price;
    }

}

public class Car extends Vehicle {

    private int speed;
    private double market_price;
    private String model;
    private double base;

    public void read() {
        System.out.print("Enter Model Name:");
        model = input.next();
        System.out.print("Enter Speed:");
        speed = input.nextInt();
    }

    public void show() {
        System.out.println("Model:" + model);
        System.out.println("Speed:" + speed);
        if (speed >= 80) {
            base = BasePrice();
            market_price = base + base * 15 / 100;
            System.out.println("Market Price:" + market_price);
        } else {

            base = BasePrice();
            market_price = base - base * 5 / 100;
            System.out.println("Market Price:" + market_price);

        }

    }

    public static void main(String[] args) {

        Car obj = new Car();
        obj.input();
        obj.read();
        obj.display();
        obj.show();
    }
}