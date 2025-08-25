
class Solution {
    public int maxPower(String s) {
        Stack<Character> st = new Stack<>();
        int count = 1, maxCount = 1;

        st.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == st.peek()) {
                count++;
            } else {
                st.pop();
                st.push(ch);
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
