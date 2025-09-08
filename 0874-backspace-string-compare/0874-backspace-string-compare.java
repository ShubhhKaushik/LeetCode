class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();

        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(ch[i]);
            }
        }

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == '#') {
                if (!st1.isEmpty()) st1.pop();
            } else {
                st1.push(ch1[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        while (!st1.isEmpty()) {
            sb1.append(st1.pop());
        }

        return sb.toString().equals(sb1.toString());
    }
}
