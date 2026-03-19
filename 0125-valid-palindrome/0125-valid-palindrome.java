class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
       StringBuilder original = new StringBuilder();
StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < lower.length(); i++) {
            char ch=lower.charAt(i);
            if ((ch>= 'a' && ch<= 'z') || (ch >= '0' &&ch <= '9')) {
                original.append(ch);
            }
        }
        for (int i = lower.length() - 1; i >= 0; i--) {
           char a=lower.charAt(i);
            if ((a>= 'a' && a<= 'z') || (a >= '0' &&a <= '9')) {
                reversed.append(a);
            }
        }
        if (original.toString().equals(reversed.toString())) {
            return true;
        } else {
            return false;
        }

    }
}