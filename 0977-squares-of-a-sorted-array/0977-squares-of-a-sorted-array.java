class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
        for(int i=0;i<n;i++){
            int square =  (int)Math.pow(nums[i], 2);
            nums[i] =square;
        }
        
        Arrays.sort(nums);
        return nums;
    }
}