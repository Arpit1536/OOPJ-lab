package lab6.Q3;

import java.util.Scanner;

public class ProcessInputDemo {

    static void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            double result = Math.sqrt(num);
            System.out.println("Double value: " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            ProcessInput(n);

        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: NegativeNumberException: " + e.getMessage());
        }

        sc.close();
    }
}