class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] < arr[mid+1]){
                //main ascending order wale part me hu
                // iska mtlb mai lefy part me hu
                //or answer right me hai 
                //toh right part me move kro
                s = mid + 1;
            }
            else{
                //arr[mid] >= arr[mid+1]
                // iska mtlb hai right part me hu
                //iska mtlb mai ek poitential solution pr khadaa hu 
                ans = mid;
                //now i have to find the final solution
                //mujhe pta h right part descending order wala hai
                //toh bada number agar exist krta hai, to pkka left me hi milega
                //left me move kro
                e = mid - 1;
            }
        }
        return ans;
    }
}