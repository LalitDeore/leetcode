class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            ans = nums[i+1]^nums[i];
            if(ans == 0){
                return true;
            }
        }
        
        return false;
    }
}