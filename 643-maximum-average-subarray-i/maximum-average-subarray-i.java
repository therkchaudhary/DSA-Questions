class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //current window ka sum store karega
        int windowSum = 0;

        //sabse pehle first window (size = k) ka sum nikaal rahe hai 
        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }

        //Abhi tak sirf ek hi window dekhi hai,
        //isiliye wahi maximum sum hai 
        int maxSum = windowSum;

        //Ab window ko ek-ek step right side move karenge
        for(int i = k; i < nums.length; i++){
            //remove first element
            //add new element
            windowSum = windowSum - nums[i - k] + nums[i];

            //har window ke baad maximum sum update kr do
            maxSum = Math.max(maxSum, windowSum);
        }
        //average = maximum sum / window size
        return (double) maxSum / k;
    }
}