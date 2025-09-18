class Solution {
    public int removeDuplicates(int[] nums) {
       int n = nums.length;
       int i=0,k=0,j=1;
       nums[k] = nums[i];
       while(j<n){
        if(nums[i]!=nums[j]){
            nums[++k] = nums[j];
            i = j;
        }
        j++;
       }
       return k+1;
    }
}