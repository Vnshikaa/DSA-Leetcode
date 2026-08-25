class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1; ; i++){
            int multiple=i*k;
            boolean found=false;
            for(int j=0;j<=nums.length-1;j++){
                if(nums[j]==multiple){
                    found=true;

                }
            }
            if(!found){
                return multiple;
            }
            
        }
        
    }
}