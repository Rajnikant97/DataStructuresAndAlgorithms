package dsa.algorithms.recursion;

public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        int a = 48;
        int b = 18;
        System.out.println(gcd.findGCDbyDivide(a, b));
        System.out.println(gcd.findGCDbyDifference(a, b));
    }

    public int findGCDbyDivide(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return findGCDbyDivide(b, a % b);
    }

    public int findGCDbyDifference(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return findGCDbyDifference(b, Math.abs(a - b));
    }
}
