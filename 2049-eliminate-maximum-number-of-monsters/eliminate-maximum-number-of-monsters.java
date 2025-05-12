import java.util.Arrays;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] time = new double[n];

        for (int i = 0; i < n; i++) {
            time[i] = (double) dist[i] / speed[i];  // Correct floating-point division
        }

        Arrays.sort(time);  // Sort by time to reach city

        for (int i = 0; i < n; i++) {
            if (time[i] <= i) {
                return i;  // Monster reached before or at the same minute
            }
        }

        return n;  // All monsters eliminated
    }
}
