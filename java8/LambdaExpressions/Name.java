package java8.LambdaExpressions;

interface A {
    void display(String name);
}

public class Name {
    public static void main(String[] args) {
        A a = (name) -> System.out.println("my name is " + name);
        a.display("sameer");
    }
}
