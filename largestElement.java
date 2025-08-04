public class largestElement {
    public static int findLagrest(int[] nums) {
        
        int largest = nums[0];
        for(int i = 1; i< nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
        
    }
    public static void main(String[] args) {
        int[] nums = {88, 55, 77,34, 99};
        int max = findLagrest(nums);
        System.out.println("The largest element in the array is: " + max);
    }
}
