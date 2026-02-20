package lab6.Q4;

import java.util.Scanner;

public class TimeDemo {

    int hr, min, sec;

    void getTime(int hr, int min, int sec)
            throws HrException, MinException, SecException {

        if (hr < 24 && hr >= 0) {
            this.hr = hr;
        } else {
            throw new HrException("hour is not greater than 24");
        }

        if (min < 60 && min >= 0) {
            this.min = min;
        } else {
            throw new MinException("minute is not greater than 60");
        }

        if (sec < 60 && sec >= 0) {
            this.sec = sec;
        } else {
            throw new SecException("second is not greater than 60");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeDemo t = new TimeDemo();

        try {
            System.out.print("Enter hours: ");
            int h = sc.nextInt();

            System.out.print("Enter minutes: ");
            int m = sc.nextInt();

            System.out.print("Enter seconds: ");
            int s = sc.nextInt();

            t.getTime(h, m, s);

            System.out.println("Correct Time: " + h + ":" + m + ":" + s);

        } catch (HrException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidHourException: " + e.getMessage());

        } catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidMinuteException: " + e.getMessage());

        } catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidSecondException: " + e.getMessage());
        }

        sc.close();
    }
}
