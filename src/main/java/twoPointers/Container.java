package twoPointers;

public class Container {
    public static int withMostWater(int[] height) {

        if (height.length < 2) {
            return 0;
        }
        // left pointer
        int left = 0;
        // right pointer
        int right = height.length - 1;

        // var to store the maximum amount of water
        int maxWater = 0;

        while (left < right) {
            // calculate water b/n two pointers
            int water = Math.min(height[left], height[right]) * (right - left);

            // Get the max of water stored b/n previous pointers and current pointers
            maxWater = Math.max(water, maxWater);

            // if left wall is of lower height, move left pointer forward
            if (height[left] < height[right]) left++;

            //  if left wall is higher , move right pointer backward
            else right--;
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = {2, 8, 6, 3, 5, 4, 7};
        int result = withMostWater(height);
        System.out.println(result);
    }
}
