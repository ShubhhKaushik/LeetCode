class Solution {
    static int[] dp;
    public int min(int i, int[] cost){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(min(i+1,cost),min(i+2,cost));
        
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(min(0,cost),min(1,cost));
    }
}