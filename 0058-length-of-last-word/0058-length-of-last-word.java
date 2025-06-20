class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        int size = 0;
        for(int i = ch.length-1;i>=0;i--){
            if(ch[i]==' '){
                break;
            }
            size++;
        }
        return size;
    }
}