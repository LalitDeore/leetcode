class Solution {
    
    public static void findComination(List<List<Integer>> combination, List<Integer> ll, int index, int[] candidates, int target, int sum){
        
        //base case
        if(sum>target) return;
        if(sum == target) {
                combination.add(new ArrayList<>(ll));

                return;
        }
        
        for(int i = index;i<candidates.length;i++){
            ll.add(candidates[i]);
            sum+=candidates[i];
            findComination(combination, ll, i, candidates, target, sum);
            ll.remove(ll.size() - 1);
            sum-=candidates[i];
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> combination = new ArrayList<List<Integer>>();
        
        List<Integer> ll = new ArrayList<>();
        
        int index = 0;
        int sum = 0;
        findComination(combination, ll, index, candidates, target, sum);
        
        return combination;
        
    }
}