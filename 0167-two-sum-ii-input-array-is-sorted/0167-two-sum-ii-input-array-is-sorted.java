class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int right = numbers.length - 1;

        for (int left = 0; left < numbers.length; left++) {
            while (left < right) {

                int sum = numbers[left] + numbers[right];
                
                /*if target found,return. Else if sum is less than target move forward.Else if sum is more than the target, move backward*/

                if (sum == target) {
                    return new int[] { left + 1, right + 1 };
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }

            }
        }

        return new int[] {};
    }
}
