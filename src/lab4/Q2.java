package lab4;

interface Motor {
    int capacity = 5;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }
}

public class Q2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
