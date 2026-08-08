class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        // last[j] = latest index in word1 from which
        // word2[j...] can be matched as a subsequence
        int[] last = new int[m];

        for (int i = 0; i < m; i++) {
            last[i] = -1;
        }

        int i = n - 1;
        int j = m - 1;

        // Find the latest possible matching positions
        // for every suffix of word2.
        while (i >= 0 && j >= 0) {

            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }

            i--;
        }

        int[] ans = new int[m];

        boolean mismatchUsed = false;
        j = 0;

        for (i = 0; i < n && j < m; i++) {

            // Exact match
            if (word1.charAt(i) == word2.charAt(j)) {

                ans[j] = i;
                j++;

            }
            // Use this position as the one mismatch
            else if (!mismatchUsed &&
                     (j == m - 1 || i < last[j + 1])) {

                ans[j] = i;
                j++;
                mismatchUsed = true;
            }
        }

        // Could not construct a valid sequence
        if (j != m) {
            return new int[0];
        }

        return ans;
    }
}