package dsa.algorithms.recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        PowerOfNumber p = new PowerOfNumber();
        int a = 3;
        int b = 4;
        System.out.println(p.calculate(a, b));

    }

    public int calculate(int base, int exponent) {
        if(exponent < 0) {
            return 0;
        }
        if(exponent == 0) {
            return 1;
        }
        return base * calculate(base, exponent - 1);
    }
}
