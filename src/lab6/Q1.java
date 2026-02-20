package lab6;

public class Q1 {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3, 4};  // size = 4

            for (int i = 0; i <= arr.length; i++) {  // intentionally wrong
                System.out.println(arr[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
