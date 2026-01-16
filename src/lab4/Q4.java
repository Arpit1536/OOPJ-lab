package lab4;

import java.util.Scanner;

interface EmployeeQ4 {
    void getDetails(int id, String name);
}

interface ManagerQ4 extends EmployeeQ4 {
    void getDeptDetails(int did, String dname);
}

class Head implements ManagerQ4 {
    int empid, deptid;
    String empname, deptname;

    public void getDetails(int id, String name) {
        empid = id;
        empname = name;
    }

    public void getDeptDetails(int did, String dname) {
        deptid = did;
        deptname = dname;
    }

    void display() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + empname);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee id - ");
        int eid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name - ");
        String ename = sc.nextLine();

        System.out.print("Enter department id - ");
        int did = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department name - ");
        String dname = sc.nextLine();

        Head h = new Head();
        h.getDetails(eid, ename);
        h.getDeptDetails(did, dname);
        h.display();
    }
}
