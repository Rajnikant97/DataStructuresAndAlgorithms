package dsa.algorithms.recursion;

public class ProductOfArray {
    public static void main(String[] args) {
        ProductOfArray p = new ProductOfArray();
        int[] arr = {2, 3, 7, 5};
        int n = arr.length;
        System.out.println(p.productOfArray(n, arr));
    }

    public int productOfArray(int n, int[] arr) {
        if(n == 1) {
            return arr[0];
        }
        return arr[n - 1] * productOfArray(n - 1, arr);
    }
}
