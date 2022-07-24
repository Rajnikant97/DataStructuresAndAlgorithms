package dsa.algorithms.recursion;

import java.util.Arrays;

/*
    Write a recursive function called someRecursive which accepts an array and a callback.
    The function returns true if a single value in the array return true when passed to the callback.
    otherwise return false
    Ex.
    someRecursive({2,3,4,6}, isOdd) -> true
    someRecursive({2,4,6,8}, isOdd) -> false
 */

public class SomeRecursive {
    public static void main(String[] args) {
        SomeRecursive s = new SomeRecursive();
        int[] arr = {2, 4, 6, 8};
        int[] brr = {2, 3, 6, 8, 4};
        System.out.println(s.someRecursive(arr, new OddFunction()));
        System.out.println(s.someRecursive(brr, new OddFunction()));
    }

    public boolean someRecursive(int[] arr, OddFunction odd) {
        int len = arr.length;
        if (len <= 0) {
            return false;
        }
        return odd.run(arr[0]) || someRecursive(Arrays.copyOfRange(arr, 1, len), odd);
    }

    public static class OddFunction {
        boolean run(int num) {
            if (num % 2 == 0) {
                return false; }
            else {
                return true;
            }
        }
    }
}
