class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
                List<String> test = new ArrayList<>(wordDict);
        
        //declare a boolean dp array with size = n+1
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        
        //iterate over from i = 1 to <=n where n is the string length
        for (int i = 1; i <= s.length(); i++) {
            
            //iterate over j from 0 to < i each time checking if
            for (int j = 0; j < i; j++) {
                if(dp[j] && test.contains(s.substring(j,i))) {
               dp[i] = true;
                break;
                    
                }
            } //end of inner loop
        }
 return dp[s.length()];
    }
}