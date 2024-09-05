package learnException;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try {

            try{
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e.getMessage());
            }

            String text = null;
            System.out.println(text.length());


        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}
