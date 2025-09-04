class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int [] pse = new int[n];
        int [] nse = new int[n];
        int mArea = 0;
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);

        // NSE
        for(int i= n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>= arr[i]) st.pop();
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        // clear stack
        while(st.size()>0) st.pop();

        // PSE
        pse[0] = -1;
        st.push(0);
        for(int i= 1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>= arr[i]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        // compute max area
        for(int i=0;i<n;i++){
            int area = arr[i] * (nse[i] - pse[i] - 1);
            mArea = Math.max(area,mArea);
        }
        return mArea;
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // convert to int matrix for histogram heights
        int[][] heights = new int[n][m];
        // first row copy
        for(int j=0;j<m;j++){
            heights[0][j] = (matrix[0][j] - '0');
        }
        // build histogram heights
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == '1'){
                    heights[i][j] = heights[i-1][j] + 1;
                } else {
                    heights[i][j] = 0;
                }
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            int area = largestRectangleArea(heights[i]);
            max = Math.max(max,area);
        }
        return max;
    }
}
