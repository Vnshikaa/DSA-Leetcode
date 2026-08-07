class Solution {
    public char kthCharacter(int k) {
        String word = "a";

        while (word.length() < k) {
            StringBuilder temp = new StringBuilder();

            for (char c : word.toCharArray()) {
                temp.append((char)(c + 1));
            }

            word += temp;
        }

        return word.charAt(k - 1);
    }
}
