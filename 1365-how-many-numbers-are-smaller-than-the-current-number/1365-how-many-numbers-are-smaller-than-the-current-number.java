class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int answer[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = 0, count = 0;
            while (j < nums.length) {
                if (nums[j] < nums[i]) {

                    count++;
                }
                j++;

            }
            answer[i] = count;
        }
        return answer;
    }
}