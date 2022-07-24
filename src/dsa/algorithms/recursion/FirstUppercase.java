package dsa.algorithms.recursion;

public class FirstUppercase {
    public static void main(String[] args) {
        FirstUppercase f = new FirstUppercase();
        String str = "hello Java";
        System.out.println(first(str));
    }
    static char first(String str) {
        int len = str.length();
        if (len <= 0) {
            return ' ';
        }
        char ch = str.charAt(0);
        if (Character.isUpperCase(ch)) {
            return ch;
        } else {
            return first(str.substring(1, len));
        }
    }

}
