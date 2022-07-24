package dsa.algorithms.recursion;

public class CapitalizeWord {
    public static void main(String[] args) {
        CapitalizeWord c =new CapitalizeWord();
        String str = "i love you";
        System.out.println(c.capitalizeWord(str));
    }
    public String capitalizeWord(String str){
        int len = str.length();
        if (len <= 0) {
            return "";
        }

        char cap = str.charAt(len-1);
        if(len == 1 || str.charAt(len-2) == ' ') {
            cap = Character.toUpperCase(cap);
        }
        return capitalizeWord(str.substring(0, len - 1)) + cap;
    }
}
