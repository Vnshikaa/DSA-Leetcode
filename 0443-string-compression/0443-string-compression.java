class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            count = 1;

            while (i + 1 < chars.length &&
                   chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[index++] = chars[i];

            if (count > 1) {
                String s = String.valueOf(count);

                for (int j = 0; j < s.length(); j++) {
                    chars[index++] = s.charAt(j);
                }
            }
        }

        return index;
    }
}