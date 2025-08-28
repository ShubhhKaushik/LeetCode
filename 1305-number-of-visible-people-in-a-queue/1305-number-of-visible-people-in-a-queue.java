class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(heights[n-1]);
        ans[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            int count = 0;
            while(st.size()>0 && st.peek()<=heights[i]){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;
            ans[i] = count;
            st.push(heights[i]);
        }
        return ans;
    }
}