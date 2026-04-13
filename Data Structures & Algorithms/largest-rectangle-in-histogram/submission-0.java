class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] ps = new int[n];
        int[] ns = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i] = -1;
            }else{
                ps[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ns[i] = n;
            }else{
                ns[i] = st.peek();
            }
            st.push(i);
        }
        int maxarea = 0;
        for(int i=0;i<n;i++){
            int currarea = heights[i] * (ns[i]-ps[i]-1);
            maxarea = Math.max(maxarea, currarea);
        }
        return maxarea;
    }
}
