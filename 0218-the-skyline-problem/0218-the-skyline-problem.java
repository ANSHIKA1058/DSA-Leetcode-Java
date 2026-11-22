
import java.util.*;

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {

        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Store all building events
        List<int[]> events = new ArrayList<>();

        for (int[] b : buildings) {
            events.add(new int[]{b[0], -b[2]});
            events.add(new int[]{b[1], b[2]});
        }

        // Step 2: Sort events
        Collections.sort(events, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        // Step 3: Max Heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        pq.add(0);

        int prevMax = 0;

        // Step 4: Process each event
        for (int[] event : events) {

            int x = event[0];
            int h = event[1];

            if (h < 0) {
                // Building starts
                pq.add(-h);
            } else {
                // Building ends
                pq.remove(h);
            }

            // Current maximum height
            int currMax = pq.peek();

            // Skyline changes
            if (currMax != prevMax) {
                ans.add(Arrays.asList(x, currMax));
                prevMax = currMax;
            }
        }

        return ans;
    }
}
