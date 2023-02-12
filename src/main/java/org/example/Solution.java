package org.example;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++) {
            int currentNum = nums[i];
            if (hashMap.containsKey(target-currentNum)) {
                result[0] = i;
                result[1] = hashMap.get(target - currentNum); break;
            } else {
                hashMap.put(currentNum, i);
            }
        }
        return result;
    }
}
