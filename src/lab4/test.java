package lab4;


//write a java program to import 2 strings and 2 substrings,
// check the first substring in first string and the second substring
// in second string if present or not . iF it is present in both then concatenate the 2 substrings.
// eg: input->hello , world , he , wo , output -> hewo
// else print "substring not found"


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.print("Enter first substring: ");
        String sub1 = sc.nextLine();

        System.out.print("Enter second substring: ");
        String sub2 = sc.nextLine();

        if (s1.contains(sub1) && s2.contains(sub2)) {
            System.out.println(sub1 + sub2);
        } else {
            System.out.println("substring not found");
        }
    }
}
