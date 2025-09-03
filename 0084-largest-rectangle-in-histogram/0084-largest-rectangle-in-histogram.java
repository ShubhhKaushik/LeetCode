class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int [] pse = new int[n];
        int [] nse = new int[n];
        int mArea = 0;
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i= n-2;i>=0;i--){
        while(st.size()>0 && arr[st.peek()]>= arr[i]) st.pop();
        if(st.size()==0) nse[i] = n;
        else nse[i] = st.peek();
        st.push(i);
        }
        while(st.size()>0) st.pop();
        pse[0] = -1;
        st.push(0);
        for(int i= 1;i<n;i++){
        while(st.size()>0 && arr[st.peek()]>= arr[i]) st.pop();
        if(st.size()==0) pse[i] = -1;
        else pse[i] = st.peek();
        st.push(i);
        }
        for(int i=0;i<n;i++){
            int area = arr[i] * (nse[i] - pse[i] - 1);
            mArea = Math.max(area,mArea);
        }
        return mArea;
    }
}