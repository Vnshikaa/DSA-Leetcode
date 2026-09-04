class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        int arr[]=new int[n];
        arr[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            arr[i]=Math.min(nums[i],arr[i+1]);
        }
        int maxLeft=nums[0];
        for(int i=0;i<nums.length;i++){
            maxLeft=Math.max(maxLeft,nums[i]);
        
        
            int instability=maxLeft-arr[i];
            if(instability<=k){
                return i;
            }
        }
        return -1;
    }
}