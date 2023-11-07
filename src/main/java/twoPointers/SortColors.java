package twoPointers;

import java.util.Arrays;

public class SortColors {
    public static int[] sortColors(int[] colors) {
        int start = 0, mid = 0, end = colors.length - 1;
        while (mid <= end) {
            switch (colors[mid]) {
                case 0 -> swap(colors, start++, mid++);
                case 1 -> mid++;
                case 2 -> swap(colors, mid, end--);
            }
        }
        return colors;
    }

    private static void swap(int[] colors, int mid, int right) {
        int temp = colors[mid];
        colors[mid] = colors[right];
        colors[right] = temp;
    }

    public static void main(String[] args) {
        int[] colors = {2, 2, 0, 1, 2, 2, 0, 2};
        System.out.println(Arrays.toString(sortColors(colors)));
    }
}