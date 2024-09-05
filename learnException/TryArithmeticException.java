package learnException;

public class TryArithmeticException {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("123");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("error is : "+e);
        }
    }
    }

