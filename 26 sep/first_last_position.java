class Solution {
    boolean found=false;
    public int binaryleft(int nums[],int target){
        int l=0,r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target) found=true;
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public int binaryright(int nums[],int target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return r;
    }
    public int[] searchRange(int[] nums, int target) {
        int a=binaryleft(nums,target);
        System.out.println(a);
        if(!found){
            return new int[]{-1,-1};
        }
        int b=binaryright(nums,target);
        System.out.println(b);
        int ans[]=new int[2];
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}