package twoPointers;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result, 1);


        int left = 0;
        int right = arr.length - 1;
        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < arr.length; i++) {
            result[left] *= leftProduct;
            result[right] *= rightProduct;
            leftProduct *= arr[left];
            rightProduct *= arr[right];
            left++;
            right--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, -1, -3, 2, 1, -2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
