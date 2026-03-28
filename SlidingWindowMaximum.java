import java.util.*;

class SlidingWindowMaximum {

    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Pair p2) {
            return p2.val - this.val; // max heap
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int j = 0;

        for (int i = 0; i < n; i++) {
            pq.add(new Pair(nums[i], i));

            while (pq.peek().idx <= i - k) {
                pq.poll();
            }

            if (i >= k - 1) {
                res[j++] = pq.peek().val;
            }
        }

        return res;
    }
}