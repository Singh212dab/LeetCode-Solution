class Solution {
    public List<Integer> grayCode(int n) {
      ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        ArrayList<Integer> toAddAll = new ArrayList<Integer>();
        for (int i = 0; i < n; i ++){
            toAddAll.clear();
            int offset = 1 << i;
            for (int j = result.size() -1 ; j >= 0; j --){
                int toAdd = result.get(j) + offset;
                toAddAll.add(toAdd);
            }
            result.addAll(toAddAll);
        }
        return result;
    }
}   
