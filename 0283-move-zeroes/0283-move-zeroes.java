class Solution {
    public void moveZeroes(int[] nums) {
        int i,j = 0;

         
        //step 1: move non zeroes to the front
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }

        }

        //step 2:make the remaining as zeroes
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}