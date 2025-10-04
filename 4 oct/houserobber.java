class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=n;i++){
            int pick=nums[i-1]+dp[i-2];
            int nopick=0+dp[i-1];
            dp[i]=Math.max(pick,nopick);
        }
        return dp[n];
    }
    // public int helper(int nums[],int idx){
    //     if(idx==nums.length-1) return nums[nums.length-1];
    //     if(idx>=nums.length) return 0;
    //     int pick=nums[idx]+helper(nums,idx+2);
    //     int nopick=0+helper(nums,idx+1);
    //     return Math.max(pick,nopick);
    // }
}