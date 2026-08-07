class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxavg, windowsum=0;

       for(int i=0;i<k;i++){
        windowsum+=nums[i];
       }
       maxavg=windowsum/k;

       for(int i=k;i<nums.length;i++){
        windowsum+=nums[i];
        windowsum-=nums[i-k];
        maxavg=Math.max(maxavg,windowsum/k);
       }
       return maxavg;
    }
}