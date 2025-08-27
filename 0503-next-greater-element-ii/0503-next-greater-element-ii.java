class Solution {
    public int max(int[] arr){
        int x = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x = arr[i];
            }
        }
        return x;
    }
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            stk.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            while(stk.size()>0 && stk.peek()<=nums[i]) stk.pop();
            if(stk.size()==0) res[i] = -1;
            else res[i] = stk.peek();
            stk.push(nums[i]);
        }
        return res;
    }
}