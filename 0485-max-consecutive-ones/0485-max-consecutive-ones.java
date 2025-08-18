class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int j = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i]==1){
                j++;
                count = Math.max(count,j);
            }else
                j = 0;
            i++;
        }
        return count;
    }
}