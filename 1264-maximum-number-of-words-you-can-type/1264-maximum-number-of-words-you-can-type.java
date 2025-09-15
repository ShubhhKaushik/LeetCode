class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            broken.add(c);
        }
        String[] words = text.split(" ");
        int count = 0;
        outer: for (String word : words) {
            for (char c : word.toCharArray()) {
                if (broken.contains(c)) {
                    continue outer;
                }
            }
            count++;
        }

        return count;
    }
}
