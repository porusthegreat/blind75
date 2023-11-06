package twoPointers;

import java.util.Arrays;

public class ThreeSum {

    static int[] result;

    public static void main(String[] args) {
        ThreeSum sum = new ThreeSum();
        int[][] numList = {{3, 7, 1, 2, 8, 4, 5},
                {-1, 2, 1, -4, 5, -3},
                {2, 3, 4, 1, 7, 9},
                {1, -1, 0},
                {2, 4, 2, 7, 6, 3, 1}};

        int[] testList = {10, 7, 20, -1, 8};


        for (int i = 0; i < testList.length; i++) {
            System.out.print(i + 1);
            System.out.println(".\tInput array: " + Arrays.toString(numList[i]));

            if (sum.findSumOfThree(numList[i], testList[i])) {
                System.out.println("\tSum for " + testList[i] + " exists ");
            } else {
                System.out.println("\tSum for " + testList[i] + " does not exist ");
            }
        }
    }

    public boolean findSumOfThree(int[] arr, int target) {
        if (arr.length < 3) {
            return false;
        } else {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                int left = i + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int sum = arr[left] + arr[right] + arr[i];
                    if (sum == target) {
                        result = new int[]{arr[left], arr[right], arr[i]};
                        System.out.println(Arrays.toString(result));
                        return true;
                    }
                    if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return false;
    }
}