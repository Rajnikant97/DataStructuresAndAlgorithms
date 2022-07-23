package dsa.algorithms.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits s = new SumOfDigits();
        int n = 3452;
        System.out.println(s.calculate(n));

    }

    public int calculate(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0) {
            return 0;
        }
        return n % 10 + calculate(n / 10);
    }
}
