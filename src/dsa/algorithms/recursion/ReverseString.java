package dsa.algorithms.recursion;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString r  = new ReverseString();
        String str = "avaJ olleH";
        System.out.println(r.reverse(str));
    }

    public String reverse(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
