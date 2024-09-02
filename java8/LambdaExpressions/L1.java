package java8.LambdaExpressions;

interface SumCalc {
    int add(int a, int b);
}

public class L1 {
    public static void main(String[] args) {
        SumCalc add=(a,b)->a+b;

        int r1 = add.add(5,5);
        int r2 = add.add(-5,5);

        System.out.println("addition of r1 is :"+r1);
        System.out.println("addition of r2 is :"+r2);
    }
}
