package leetcode75.slidingWindow;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        // initial window's average
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double max_average = sum / k;


        // slding window
        for(int i = k; i < n; i++){
            sum += nums[i] - nums[i - k];
            max_average = Math.max(sum/k, max_average);
        }

        return max_average;

    }
}
