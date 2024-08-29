package java8.LambdaExpressions;

@FunctionalInterface
interface cube {
    int calc(int x);
}

public class One {
    public static void main(String[] args) {
        int a = 5;
        cube cube = (int x) -> (x * x * x);
        cube forth = (int x) -> (x * x * x * x);

        int ans = cube.calc(a);
        int ans1 = forth.calc(a);

        System.out.println(ans);
        System.out.println(ans1);
    }
}
