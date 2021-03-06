class Solution {
    public boolean isNumber(String s) {
     s = s.trim();
        if (s.indexOf("e") != -1) {
            int cut = s.indexOf("e");
            return validNumber(s.substring(0, cut), true) && validNumber(s.substring(cut + 1), false);
        }
        else {
            return validNumber(s, true);
        }
    }
    private boolean validNumber(String s, boolean canBeDouble) {
        if (s.length() == 0) {
            return false;
        }
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            s = s.substring(1);
        }
        if (s.indexOf(".") != -1) {
            if (canBeDouble == false) {
                return false;
            }
            int cut = s.indexOf(".");
            return (validInteger(s.substring(0, cut), true) && validInteger(s.substring(cut + 1), false)) || (validInteger(s.substring(0, cut), false) && validInteger(s.substring(cut + 1), true));
        }
        else {
            return validInteger(s, false);
        }
    }
    private boolean validInteger(String s, boolean canBeEmpty) {
        if (!canBeEmpty && s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
