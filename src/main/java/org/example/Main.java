package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int [] nums = new int[] {1,8,5,7,3};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}