package dsa.algorithms.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary dtb = new DecimalToBinary();
        int d = 37;
        System.out.println(dtb.decimalToBinary(d));
    }

    public int decimalToBinary(int d) {
        if (d == 0) {
            return 0;
        }
        return decimalToBinary(d / 2) * 10 + d % 2;
    }
}
