class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int [] count = new int[n];
        for(int i = 0;i<n;i++){
            int x = nums[i];
            if(count[x]==0){
                count[x] = 1;
            }else return x;
        }
        return -1;
    }
}