class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    HashSet<ArrayList<Integer>> set = new HashSet<>();
    public void solve(int[] nums, int i, ArrayList<Integer> curr, List<List<Integer>> ans){
        if(i==nums.length){
            ArrayList<Integer> temp = new ArrayList<>(curr);
            if(set.contains(temp)){
                return;
            }else{
                set.add(temp);
                ans.add(temp);
                return;
            }
            
        }
        curr.add(nums[i]);
        solve(nums,i+1,curr,ans);
        curr.remove(curr.size()-1);
        solve(nums,i+1,curr,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}
