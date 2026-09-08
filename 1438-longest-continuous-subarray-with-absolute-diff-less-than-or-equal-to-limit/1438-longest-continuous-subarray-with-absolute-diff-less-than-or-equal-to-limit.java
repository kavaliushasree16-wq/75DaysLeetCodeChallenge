class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxdq = new ArrayDeque<>();
        Deque<Integer> mindq = new ArrayDeque<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            while (!maxdq.isEmpty() && nums[maxdq.peekLast()] < nums[right]) {
                maxdq.removeLast();
            }
            maxdq.addLast(right);

            while (!mindq.isEmpty() && nums[mindq.peekLast()] > nums[right]) {
                mindq.removeLast();
            }
            mindq.addLast(right);

            while ((nums[maxdq.peekFirst()] - nums[mindq.peekFirst()]) > limit) {
                left++;
                if (maxdq.peekFirst() < left) {
                    maxdq.removeFirst();
                }

                if (mindq.peekFirst() < left) {
                    mindq.removeFirst();
                }

            }

            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;

    }
}