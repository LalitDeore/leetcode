class Solution {
    public int titleToNumber(String columnTitle) {
         int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1; 
            ans = ans * 26 + value; 
        }
        return ans;
    }
}