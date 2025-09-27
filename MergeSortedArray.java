class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int a:nums2){
            int s=0,e=m-1;

            while (s<=e) {
                int mid=s+(e-s) / 2; 

                if(nums1[mid]<a) {
                    s= mid+1;
                } 
                else {
                    e=mid-1; 
                }
            }
            for(int i=nums1.length-1;i>s;i--){
            
                nums1[i]=nums1[i-1];
                
            } 
            nums1[s]=a;
            m++;
                        
        }
    }
}