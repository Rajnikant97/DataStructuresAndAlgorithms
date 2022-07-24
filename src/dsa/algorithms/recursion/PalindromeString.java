package dsa.algorithms.recursion;

import java.util.stream.Stream;

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeString p = new PalindromeString();
        String str = "absksba";
        System.out.println(p.isPalindrome(str));
        str = "abcd";
        System.out.println(p.isPalindrome(str));
    }
    public  boolean isPalindrome(String s) {
        int len = s.length();
        if(len <= 1) {
            return true;
        }
        return (s.charAt(0) == s.charAt(len - 1)) && isPalindrome(s.substring(1, len - 1));
    }

}
