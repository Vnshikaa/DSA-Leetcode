class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j=nums.length-1;
        long ans=0;

        while(i<j){
        String s=String.valueOf(nums[i]) + String.valueOf(nums[j]);
        ans=ans+Long.parseLong(s);
        i++;
        j--;
        }
        if(i==j){
            ans=ans+nums[i];
        }
        return ans;
    }
}