class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < asteroids.length; i ++) {
            int speed = asteroids[i];
            if (speed > 0 || q.isEmpty() || q.peekLast() < 0) {
                q.add(speed);
                continue;
            }
            int pre = q.peekLast();
            if (pre > -speed) {
                continue;
            }
            else if (pre == -speed) {
                q.pollLast();
            }
            else {
                q.pollLast();
                i --;
            }
        }
        int[] res = new int[q.size()];
        int i = 0;
        for (Integer num:q) {
            res[i ++] = num;
        }
        return res;
    }
}
   