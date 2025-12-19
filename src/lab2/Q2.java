package lab2;

class Q2 {

    // static variable to count objects
    static int count = 0;

    // constructor
    Q2() {
        count++;
    }

    public static void main(String[] args) {

        // creating objects
        Q2 obj1 = new Q2();
        Q2 obj2 = new Q2();
        Q2 obj3 = new Q2();

        // displaying number of objects created
        System.out.println("Number of objects created = " + count);
    }
}
