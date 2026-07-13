class Solution {

    static int findPivotIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        // Array is already sorted (also handles single element array)
        if (nums[s] <= nums[e]) {
            //no effective rotation
            return -1;
        }

        //binary search wala logic
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] >= nums[0]) {
                //iska mtlb hum L2 wali line pr h
                //answer to L1 wali line pr h
                //iska mtlb move to L1, or left
                ans = mid;
                s = mid + 1;

                
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    static int binarySearch(int nums[], int s, int e, int target) {
        int n = nums.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        int n = nums.length;

        //if pivotIndex = -1, than array is already sorted
        if (pivotIndex == -1) {
            int ans = binarySearch(nums, 0, n - 1, target);
            return ans;
        } else {
            //array is not sorted, array is rotated sorted

            //array can be divided into L1 and L2 wala logic

            //indexes for L1 wala array ka part
            int startArray1 = 0;
            int endArray1 = pivotIndex;

            if (target >= nums[startArray1] && target <= nums[endArray1]) {
                int ans = binarySearch(nums, startArray1, endArray1, target);
                return ans;
            }

            //indexes for L2 wala array ka part
            int startArray2 = pivotIndex + 1;
            int endArray2 = n - 1;

            //added startArray2 < n to avoid ArrayIndexOutOfBoundsException
            if (startArray2 < n &&
                target >= nums[startArray2] &&
                target <= nums[endArray2]) {

                int ans = binarySearch(nums, startArray2, endArray2, target);
                return ans;
            }
        }

        return -1;
    }
}