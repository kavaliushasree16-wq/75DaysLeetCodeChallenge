class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowsum = 0, maxAverage;

        for (int i = 0; i < k; i++) {
            windowsum += nums[i];
        }          
         
          maxAverage = windowsum / k;
 
        for (int i = k; i < nums.length; i++) {
            windowsum = windowsum + nums[i];
            windowsum = windowsum - nums[i - k];
            maxAverage = Math.max(maxAverage, windowsum / k);
        }
        return maxAverage;
    }
}