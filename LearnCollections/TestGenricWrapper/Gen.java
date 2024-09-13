package LearnCollections.TestGenricWrapper;

public class Gen {
    public static void main(String[] args) {

        dog<Integer, String> d = new dog<>(1001, "lalu");
        dog<String, String> d1 = new dog<>("001", "lalu");
        dog<Integer, String> d2 = new dog<>(23, "");


    }
}

class dog<s, r> {
    s id;
    r name;

    public dog(s id, r name) {
        this.id = id;
        this.name = name;
        System.out.println("dog is is " + id);
        System.out.println("dog name is " + name);
    }


    s getId() {
        return id;
    }

    r getName() {
        return name;
    }


}