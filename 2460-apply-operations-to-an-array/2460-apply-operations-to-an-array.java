class Solution {
    public int[] applyOperations(int[] nums) {
        int n= nums.length;
        int zeros = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]= nums[i]*2;
                nums[i+1] = 0;
                i++;
                zeros++;
            }else if(nums[i]== 0){
                zeros++;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==0 && nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            }
        }
        return nums;
    }
}