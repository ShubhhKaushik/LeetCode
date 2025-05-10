class Solution {
    public int reverse(int x) {
        int sign;
        if(x<0)
            sign = -1;
        else sign = 1;
        x = Math.abs(x);
        
        int s = 0;
        while(x!=0){
            int digit = x%10;
             if (s > (Integer.MAX_VALUE - digit) / 10) {
                System.out.println("Reversed number would overflow!");
                return 0;
            }
            s = s*10 + digit;
            x = x/10;
        }
        return s*sign;
    }
}