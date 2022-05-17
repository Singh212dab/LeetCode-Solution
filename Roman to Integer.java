class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> rMap = new HashMap<>();
        rMap.put('I', 1);
        rMap.put('V', 5);
        rMap.put('X', 10);
        rMap.put('L', 50);
        rMap.put('C', 100);
        rMap.put('D', 500);
        rMap.put('M', 1000);
        int n = s.length();
        int num = rMap.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (rMap.get(s.charAt(i)) >= rMap.get(s.charAt(i + 1))) {
                num += rMap.get(s.charAt(i));
            } else {
                num -= rMap.get(s.charAt(i));
            }
        }
        return num;
    }
}
 