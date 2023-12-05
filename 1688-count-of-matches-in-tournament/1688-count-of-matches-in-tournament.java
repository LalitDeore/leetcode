class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        int advance = 0;
        int ans = 0;
        while(n>1){
            if(n%2 == 0){
                matches = n/2;
                advance = n/2;
            }else{
                matches = (n-1)/2;
                advance = (n-1)/2+1;
            }
            ans += matches;
            n = advance;
        }
        return ans;
    }
}