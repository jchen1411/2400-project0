package Factorial;

public class Factorial {
    public static void main(String[] args) {
        final int NUM_FACTS = 20;
        for (int i = 0; i < NUM_FACTS; i++)
            System.out.println(i + "! is " + factorial(i));
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}
