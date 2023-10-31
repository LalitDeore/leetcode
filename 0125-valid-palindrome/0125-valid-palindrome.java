class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            ch1 = Character.toLowerCase(ch1);
            ch2 = Character.toLowerCase(ch2);
            
            if (ch1 == ch2) {
                i++;
                j--;
            } else if (Character.isWhitespace(ch1) || !Character.isLetterOrDigit(ch1)) {
                i++;
            } else if (Character.isWhitespace(ch2) || !Character.isLetterOrDigit(ch2)) {
                j--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
