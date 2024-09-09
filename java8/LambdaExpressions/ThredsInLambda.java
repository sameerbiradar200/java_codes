package java8.LambdaExpressions;

public class ThredsInLambda {
    public static void main(String[] args) {

        Runnable sameer = () -> {
            Thread.currentThread().setName("sameer");
            System.out.println(Thread.currentThread().getName()+" is running");

            long number = 2; 
            while (true) {
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number");
                }
                number++;
            }
        };



        Thread a =new Thread(sameer);


        a.start();
    }
    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true; 
        if (num % 2 == 0 || num % 3 == 0) return false; 
   
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
