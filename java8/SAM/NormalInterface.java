package java8.SAM;

//
//@FunctionalInterface
interface cube{
    //int calc(int x);
    void test();

    default void hi() {

    }
    static void sh(){

    }
}


public class NormalInterface implements cube {
    public static void main(String[] args) {

//        int a = 5;
//        cube c = (int x)->(x*x*x);
//        cube d = (int x)->(x*x*x*x);
//        int ans = d.calc(a);
//        System.out.println(ans);

    }

    @Override
    public void test() {
        System.out.println( "hi");
    }
}
