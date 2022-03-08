class Solution {
    
    public Set<List<Integer>> set = new HashSet<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(new ArrayList<>() ,candidates,0, target, 0);
        return new ArrayList<>(set);
    }
    
    public void dfs(List<Integer> list, int[] candidates, int sum, int target, int depth){
        if(sum > target) return;
        if(sum == target){
            List<Integer> temp = new ArrayList<>();
            for(int n : list) temp.add(n);
            set.add(temp);
            return;
        }
        
        for(int i = depth; i<candidates.length; i++){
            if(i > depth && candidates[i] == candidates[i-1]) continue;
            
            list.add(candidates[i]);
            dfs(list, candidates, sum+candidates[i], target, i+1);
            list.remove(list.size() -1);
        }
        
        
    }
}