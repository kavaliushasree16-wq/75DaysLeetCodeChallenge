class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            int maxfreq = -1;
            int element = -1;
            for (int key : map.keySet()) {
                if (map.get(key) > maxfreq) {
                    maxfreq = map.get(key);
                    element = key;
                }
            }

            ans[i] = element;
            map.put(element, -1);

        }
        return ans;

    }
}