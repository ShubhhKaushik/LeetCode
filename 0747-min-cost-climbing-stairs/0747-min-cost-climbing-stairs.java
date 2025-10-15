class Solution {
    // static int[] dp;
    // public int min(int i, int[] cost){
    //     if(i>=cost.length) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     return dp[i] = cost[i] + Math.min(min(i+1,cost),min(i+2,cost));
        
    // }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}