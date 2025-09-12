class Solution {
    public double myPow(double x, int n) {
        long N = n; // promote to long to avoid overflow
        double s = Math.pow(x, Math.abs(N));
        if (N < 0) return 1 / s;
        else return s;
    }
}
