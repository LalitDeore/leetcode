class Solution {
    public int[] getConcatenation(int[] nums) {
      
        int n = nums.length;
        
        int[] arr = new int[2*n];
        
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
        int k =0;
        for(int j=n;j<arr.length;j++){
            arr[j] = nums[k];
            k++;
        }
        
        return arr;
    }
}