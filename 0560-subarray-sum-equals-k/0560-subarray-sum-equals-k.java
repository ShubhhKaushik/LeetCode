class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int rem = 0;
        int count = 0;
        for(int ele : nums){
            rem += ele;
            if(map.containsKey(rem - k)) 
                count += map.get(rem - k);
        
        map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}