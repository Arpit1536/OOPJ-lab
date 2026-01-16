package lab4;

import java.util.Scanner;

abstract class student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}

class kiitian extends student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kiitian k = new kiitian();

        int roll = sc.nextInt();
        long reg = sc.nextLong();

        k.getinput(roll, reg);

        System.out.println("Rollno - " + k.rollno);
        System.out.println("Registration no - " + k.regno);
        k.course();
    }
}
