class Solution {
    final char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
    {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public List<String> letterCombinations(String digits) {
       int len = digits.length();
        List<String> ans = new ArrayList<>();
        if (len == 0) return ans;
        bfs(0, len, new StringBuilder(), ans, digits);
        return ans;
    }
 public void bfs(int pos, int len, StringBuilder sb, List<String> ans, String digits) {
        if (pos == len) ans.add(sb.toString());
        else {
            char[] letters = L[Character.getNumericValue(digits.charAt(pos))];
            for (int i = 0; i < letters.length; i++)
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), ans, digits);
        }
    }
}