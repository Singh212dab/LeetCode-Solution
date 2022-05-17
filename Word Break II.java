class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String>[] dp = new List[s.length() + 1];
        int len = s.length();
        dp[0] = new ArrayList<>();
        if(len == 0) return dp[0];
        Set<Integer> set = new HashSet<>();
        for(String ss : wordDict)
            set.add(ss.length());
        for(int i = 1; i <= len; i++){
            dp[i] = new ArrayList<>();
            for(Integer in : set){
                if(i - in >= 0){
                    String sub = s.substring(i - in, i);
                    if(wordDict.contains(sub)){
                        List<String> tmp = dp[i - in];
                        if(i - in == 0)
                            dp[i].add(sub);
                        else{
                            for(String ss : tmp){
                                dp[i].add(ss + " " + sub);
                            }
                        }
                    }
                }
            }
        }
        return dp[len];
    }
}