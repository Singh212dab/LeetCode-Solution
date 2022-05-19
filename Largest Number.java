class Solution {
public String largestNumber(int[] nums) {
String[] NUM = new String[nums.length];
for (int i = 0; i <nums.length; i++) {
NUM[i] = String.valueOf(nums[i]);
}
java.util.Arrays.sort(NUM, new java.util.Comparator<String>() {
public int compare(String left, String right) {
String leftRight = left.concat(right);
String rightLeft = right.concat(left);
return rightLeft.compareTo(leftRight);
}
});
StringBuilder sb = new StringBuilder();
for (int i = 0; i < NUM.length; i++) {
sb.append(NUM[i]);
}
java.math.BigInteger result = new java.math.BigInteger(sb.toString());
return result.toString();
}
}