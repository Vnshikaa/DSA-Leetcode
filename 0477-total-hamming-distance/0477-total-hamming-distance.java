
class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;

        for (int i = 0; i < 32; i++) {
            int ones = 0;

            for (int num : nums) {
                if ((num & (1 << i)) != 0) {
                    ones++;
                }
            }

            total += ones * (nums.length - ones);
        }

        return total;
    }
}
