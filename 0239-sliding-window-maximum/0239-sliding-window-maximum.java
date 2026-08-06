import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // Max Heap -> {value, index}
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        int j = 0;

        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[]{nums[i], i});

            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }
            if (i >= k - 1) {
                ans[j++] = maxHeap.peek()[0];
            }
        }

        return ans;
    }
}