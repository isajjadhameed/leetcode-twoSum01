package org.example;

import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);


    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> visitedNums = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (visitedNums.containsKey(delta)) {
                return new int[]{i, visitedNums.get(delta)};
            }
            visitedNums.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}