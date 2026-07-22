package BinarySearch;

public class Lec39Q1 {

    //Find the pivot index of a rotated array.

    public static int search(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        if(nums[s] < nums[e]){
            //no effective rotation
            return -1;
        }

        //binary search wala logic
        while(s <= e){
            int mid = s + (e-s)/2;

            if(nums[mid] <= nums[n-1]){
                //iska mtlb hum L2 wali line pr h
                //answer to L1 wali line pr h
                //iska mtlb move to L1, or left

                e = mid - 1;
            }
            else{
                //mid mera L1 pr hi h already
                //ans store
                ans = mid;
                //move to right
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 8, 0, 1, 2};
//
        int ans = search(nums);

        System.out.println("Returned Index = " + ans);
    }
}
