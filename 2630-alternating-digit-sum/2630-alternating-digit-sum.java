class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int res = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) - '0') * sign;
            sign *= -1;
        }
        return res;
    }
}