class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        HashMap<Integer, Integer> sums = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums1[i] + nums2[j];
                sums.put(sum, sums.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums3[i] + nums4[j];
                if (sums.containsKey(-sum)) {
                    count += sums.get(-sum);
                }
            }
        }

        return count;
    }
}
