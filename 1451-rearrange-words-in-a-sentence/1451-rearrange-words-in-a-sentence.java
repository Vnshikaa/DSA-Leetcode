class Solution {
    public String arrangeWords(String text) {
        String[] arr = text.toLowerCase().split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String ans = String.join(" ", arr);
        return Character.toUpperCase(ans.charAt(0)) + ans.substring(1);
    }
}