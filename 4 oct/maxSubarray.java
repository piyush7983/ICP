class Solution {
    public int maxSubArray(int[] nums) {
        return helper(nums, nums.length - 1, new int[nums.length]);
    }

    public int helper(int[] nums, int i, int[] memo) {
        if (i == 0) {
            memo[0] = nums[0];
            return nums[0];
        }

        int prev = helper(nums, i - 1, memo);
        memo[i] = Math.max(nums[i], nums[i] + memo[i - 1]);
        return Math.max(prev, memo[i]);
    }

}