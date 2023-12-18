class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int product1 = nums[1] * nums[0];
        int product2 = nums[nums.length - 1] * nums[nums.length - 2];
        
        return product2 - product1;
    }
}