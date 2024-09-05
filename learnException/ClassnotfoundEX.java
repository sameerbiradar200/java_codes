package learnException;

public class ClassnotfoundEX {
    public static void main(String[] args) {
        try {
            Class.forName("SomeThingNew.One");

        } catch (ClassNotFoundException e) {
            System.out.println("error is " +e);

        }
    }
}
