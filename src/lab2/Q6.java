package lab2;

class Calculator {

    // subtract two integers
    void subtract(int a, int b) {
        System.out.println("Result (int - int) = " + (a - b));
    }

    // subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Result (int - int - int) = " + (a - b - c));
    }

    // subtract two double values
    void subtract(double a, double b) {
        System.out.println("Result (double - double) = " + (a - b));
    }

    // subtract int and double
    void subtract(int a, double b) {
        System.out.println("Result (int - double) = " + (a - b));
    }
}

// Driver class
class Q6 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.subtract(20, 10);
        calc.subtract(50, 20, 5);
        calc.subtract(25.5, 10.2);
        calc.subtract(30, 12.5);
    }
}