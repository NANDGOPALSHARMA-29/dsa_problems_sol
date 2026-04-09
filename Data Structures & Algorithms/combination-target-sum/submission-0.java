class Solution {
    public void solve(int[] nums, int i, ArrayList<Integer> curr, List<List<Integer>> ans, int target){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==nums.length || target < 0){
            return;
        }
        curr.add(nums[i]);
        solve(nums,i,curr,ans,target-nums[i]);

        curr.remove(curr.size()-1);
        solve(nums,i+1,curr,ans,target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,new ArrayList<>(),ans,target);
        return ans;
    }
}
