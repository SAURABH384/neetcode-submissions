class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !isAlphaNum(s.charAt(l))) l++;
            while (l < r && !isAlphaNum(s.charAt(r))) r--;

            if (toLower(s.charAt(l)) != toLower(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    private boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }

    private char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + ('a' - 'A'));
        }
        return c;
    }
}
