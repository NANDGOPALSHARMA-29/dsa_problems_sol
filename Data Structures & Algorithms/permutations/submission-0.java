class Solution {
    public void solve(int[] nums, ArrayList<Integer> curr, List<List<Integer>> ans, boolean[] flag){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(flag[i]){
                continue;
            }
            flag[i] = true;
            curr.add(nums[i]);
            solve(nums,curr,ans,flag);
            curr.remove(curr.size()-1);
            flag[i] = false;

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        solve(nums,new ArrayList<>(),ans,flag);
        return ans;
        
    }
}
