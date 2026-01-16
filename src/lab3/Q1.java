package lab3;


import java.util.Scanner;

class Plastic2D {
    double length, breadth;
    final int cost = 40;

    Plastic2D(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateCost() {
        return length * breadth * cost;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    final int cost3D = 60;

    Plastic3D(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double calculateCost() {
        return length * breadth * height * cost3D;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth for sheet:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Plastic2D sheet = new Plastic2D(l, b);
        System.out.println("Cost of plastic sheet: Rs " + sheet.calculateCost());

        System.out.println("Enter length, breadth and height for box:");
        double h = sc.nextDouble();

        Plastic3D box = new Plastic3D(l, b, h);
        System.out.println("Cost of plastic box: Rs " + box.calculateCost());
    }
}


