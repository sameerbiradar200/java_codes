package java8.SAM;


interface cube{
   
    void test();

    default void hi() {

    }
    static void sh(){

    }
}


public class NormalInterface implements cube {
    public static void main(String[] args) {



    }

    @Override
    public void test() {
        System.out.println( "hi");
    }
}
