class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int[] freq = new int[26];

        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);      
            freq[ch - 'a']++;            
        }

        int maxVowel = 0, maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            if (count == 0) continue;

            char c = (char) (i + 'a');
            if ("aeiou".indexOf(c) >= 0) {
                maxVowel = Math.max(maxVowel, count);
            } else {
                maxConsonant = Math.max(maxConsonant, count);
            }
        }

        return maxVowel + maxConsonant;
    }
}
