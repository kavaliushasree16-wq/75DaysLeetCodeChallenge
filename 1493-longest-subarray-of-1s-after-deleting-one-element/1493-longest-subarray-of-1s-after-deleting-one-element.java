class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int winLen = 0;
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            winLen = Math.max(winLen, right - left);

        }
        return winLen;
    }
}