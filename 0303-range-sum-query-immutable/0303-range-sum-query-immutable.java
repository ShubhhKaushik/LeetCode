class NumArray {
    private long[] pre;
    public NumArray(int[] nums) {
        int n = nums.length;
        pre = new long[n];
        if(n==0) return;
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if(left==0) return (int) pre[right];
        else
            return (int)pre[right] - (int)pre[left-1];
    }
}
