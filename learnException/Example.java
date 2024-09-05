package learnException;

public class Example {
    public static void main(String[] args) {
        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (StackOverflowError  e) {
            System.out.println("error is : "+e);
            e.printStackTrace();
        }
        System.out.println("hi am sammer");
    }
}
