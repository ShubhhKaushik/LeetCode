class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int ans = 0;
        while(i<j){
            int w = j-i;
            int ht = Math.min(height[i],height[j]);
            int wat = w*ht;
            ans = Math.max(ans,wat);

            if(height[i]<height[j]) i++;
            else j--;
        }
        return ans;
    }
}