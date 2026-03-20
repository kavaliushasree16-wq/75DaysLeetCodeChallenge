class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j]!=nums[a]){
             a++;
             nums[a]=nums[j];
            }
        }
        return a+1;
    }
}