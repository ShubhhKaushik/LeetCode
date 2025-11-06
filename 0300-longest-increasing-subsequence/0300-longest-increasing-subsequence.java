class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> res = new ArrayList();

        for(int num:nums){
            int idx = Collections.binarySearch(res,num);
            if(idx<0){
                idx = -(idx) - 1;
            }
            if(idx == res.size()){
                res.add(num);
            }
            else{
                res.set(idx,num);
            }
        }
        return res.size();
    }
}