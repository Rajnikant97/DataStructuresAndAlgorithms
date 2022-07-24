package dsa.algorithms.recursion;

public class RecursiveRange {
    public static void main(String[] args) {
        RecursiveRange r  = new RecursiveRange();
        int n =10;
        System.out.println(r.recursiveRange(n));
    }

    /*
    add numbers from 0 to N and return the sum.
     */
    public int recursiveRange(int n) {
        if(n == 0) {
            return 0;
        }
        return n + recursiveRange(n - 1);
    }
}
