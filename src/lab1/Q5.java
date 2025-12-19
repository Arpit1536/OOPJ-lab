package lab1;

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Second Name: ");
        String lastName = sc.nextLine();

        System.out.println(lastName + " " + firstName);
    }
}