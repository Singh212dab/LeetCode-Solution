class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
     int len = heights.length - 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < len; i++) {
            int diff = heights[i+1] - heights[i];
            if (diff > 0) {
                if (ladders > 0) {
                    pq.add(diff);
                    ladders--;
                } else if (pq.size() > 0 && diff > pq.peek()) {
                    pq.add(diff);
                    bricks -= pq.poll();
                } else bricks -= diff;
                if (bricks < 0) return i;
            }
        }
        return len;
    }
}
