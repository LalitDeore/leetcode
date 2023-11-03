class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        int[] charIndex = new int[128];

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

          
            if (charIndex[ch] > left) {
                left = charIndex[ch];
            }

            
            charIndex[ch] = right + 1;

           
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
