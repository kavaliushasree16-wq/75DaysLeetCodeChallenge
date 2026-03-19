class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        String original = "", reversed = "";

        for (int i = 0; i < lower.length(); i++) {
            if ((lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z') || (lower.charAt(i) >= '0' && lower.charAt(i) <= '9')) {
                original += lower.charAt(i);
            }
        }
        for (int i = lower.length() - 1; i >= 0; i--) {
            if ((lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z') || (lower.charAt(i) >= '0' && lower.charAt(i) <= '9')) {
                reversed += lower.charAt(i);
            }
        }
        if (original.equals(reversed)) {
            return true;
        } else {
            return false;
        }

    }
}