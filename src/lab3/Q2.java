package lab3;

import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Dimensions: " + length + " x " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box Height: " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thickness = t;
        System.out.println("WoodBox Thickness: " + thickness);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, width, height and thickness:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        new WoodBox(l, w, h, t);
    }
}

