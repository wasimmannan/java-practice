package com.test.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
        RemoveDuplicatesSortedArray r = new RemoveDuplicatesSortedArray();
        int k = r.removeDuplicates(nums);
        System.out.println();
        System.out.println(k);
    }

    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }

        }
        int k = list.size();
        int j = 0;
        for (int x: list) {
            nums[j++] = x;
        }
        return k;
    }
}
