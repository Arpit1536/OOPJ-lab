package lab6.Q5;

class CheckArgument extends Exception {
    public CheckArgument(String msg) {
        super(msg);
    }
}

public class Q5 {

    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Less than four arguments");
            }

            int sum = 0;

            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println("Addition of squares: " + sum);

        } catch (CheckArgument e) {
            System.out.println("Exception occurred - CheckArgument");
        }
    }
}