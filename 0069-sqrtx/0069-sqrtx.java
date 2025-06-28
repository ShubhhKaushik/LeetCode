class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long i = 2;
        long j = x;
        while(i<=j){
            long mid = i + (j-i)/2;
            if(mid*mid==x) return (int)mid;
            else if(mid*mid>x){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return (int)j;
    }
}