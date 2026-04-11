class Solution {
    public boolean isFinish(int[] piles, int mid, int h){
        int time = 0;
        for(int x : piles){
            time += (x+mid-1)/mid;
            if(time > h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int x : piles){
            r = Math.max(r,x);
        }
        while(l<=r){
            int mid = l + (r-l)/2;
            if(isFinish(piles,mid,h)){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}
