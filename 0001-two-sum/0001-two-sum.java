class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainder = target - nums[i];
            if(map.containsKey(remainder)){
                return new int[] {map.get(remainder),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}