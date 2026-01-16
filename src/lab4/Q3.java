package lab4;

import java.util.Scanner;

interface Salary {
    double earnings();
    double deductions();
    double bonus();
}

abstract class ManagerQ3 implements Salary {
    double basic;

    ManagerQ3(double basic) {
        this.basic = basic;
    }

    public double earnings() {
        return basic + (0.8 * basic) + (0.15 * basic);
    }

    public double deductions() {
        return 0.12 * basic;
    }
}

class Substaff extends ManagerQ3 {
    Substaff(double basic) {
        super(basic);
    }

    public double bonus() {
        return 0.5 * basic;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary - ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        System.out.println("Earnings - " + (int) s.earnings());
        System.out.println("Deduction - " + (int) s.deductions());
        System.out.println("Bonus - " + (int) s.bonus());
    }
}
