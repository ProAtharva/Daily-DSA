class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int n : nums) {
            sum += n; // -2 // 0+ 1 // -2 == 0 // 4
            maxSum = Math.max(maxSum, sum); // 1 // 4 
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}