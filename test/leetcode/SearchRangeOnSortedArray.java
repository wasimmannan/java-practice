package com.test.leetcode;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 *
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */
public class SearchRangeOnSortedArray {
    public static void main(String[] args) {
        SearchRangeOnSortedArray s = new SearchRangeOnSortedArray();
        int[] nums = {3,3,3};
        int target = 3;
        int[] result = s.searchRange(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if(nums.length > 0) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == target) {
                    if(result[0] == -1) {
                        result[0] = i;
                    } else {
                        result[1] = i;
                    }
                }

                if(i == nums.length - 1 && result[1] == -1) {
                    result[1] = result[0];
                }
            }
            return result;
        }
        return result;
    }
}
