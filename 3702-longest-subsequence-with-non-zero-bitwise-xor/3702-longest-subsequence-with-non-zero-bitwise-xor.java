class Solution {
    public int longestSubsequence(int[] nums) {
        int XOR=0;
        for(int i=0;i<nums.length;i++){
            XOR=XOR ^ nums[i];
        }
        if(XOR!=0){
            return nums.length;
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                return nums.length-1;
            }
        }
        return 0;
           
    }

        
    
}