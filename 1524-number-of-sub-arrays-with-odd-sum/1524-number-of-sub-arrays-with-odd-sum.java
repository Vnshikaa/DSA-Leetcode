class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd = 0, even = 1;
        int sum = 0, count = 0;
        int mod = 1000000007;

        for (int num : arr) {
            sum += num;

            if (sum % 2 == 0) {
                count = (count + odd) % mod;
                even++;
            } else {
                count = (count + even) % mod;
                odd++;
            }
        }

        return count;
    }
}