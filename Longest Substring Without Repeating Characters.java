class Solution {
public int lengthOfLongestSubstring(String s) {
char[] arr = s.toCharArray();
int pre = 0;
HashMap<Character, Integer> map = new HashMap<Character, Integer>();
for (int i = 0; i < arr.length; i++) {
if (!map.containsKey(arr[i])) {
map.put(arr[i], i);
} else {
pre = Math.max(pre, map.size());
i = map.get(arr[i]);
map.clear();
}
}
return Math.max(pre, map.size());
} 
}