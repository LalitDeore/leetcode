class Solution {

    public boolean check(int[] nums) {
        int countBreaks = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Check if current element is greater than the next element (modulo to handle the last element with the first one)
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
            
            // If there is more than one break, it's not sorted and rotated
            if (countBreaks > 1) {
                return false;
            }
        }
        
        // If there are 0 or 1 breaks, it is a sorted and rotated array
        return true;
    }
}
