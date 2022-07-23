package dsa.algorithms.recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int n  = 5;
        System.out.println(f.factorial(n));

    }

    public int factorial(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
