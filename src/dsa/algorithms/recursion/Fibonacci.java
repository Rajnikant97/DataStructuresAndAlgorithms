package dsa.algorithms.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int n = 5;
        f.print(n);
        System.out.println(f.nthTerm(n));
    }

    public int nthTerm(int n) {
        if(n < 0){
            return -1;
        }
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }

        return nthTerm(n-1) + nthTerm(n-2);
    }

    public void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(nthTerm(i) + " ");
        }
        System.out.println();
    }
}
