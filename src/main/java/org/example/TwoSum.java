package org.example;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff)) {
                result[0] = i;
                result[1] = map.get(diff);
            } else map.put(numbers[i], i);
        }
        return result;
    }
}