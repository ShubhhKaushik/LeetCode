import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();

        for (char c : str) {
            if (st.size()>0 && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}
