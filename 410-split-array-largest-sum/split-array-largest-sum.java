class Solution {

    static boolean isValidAnswer(int nums[], int k, int maxPages){
        //check whether mid or maxPages is a valid solution or not
        int studentCount = 1;
        int pages = 0;

        for(int i=0; i<nums.length; i++){
            if(pages + nums[i] <= maxPages){
                //iska mtlb current book can be assigned
                //as it is not out of limit
                //then assign
                pages = pages + nums[i];
            }
            else{
                //current student ko current book cannot be assigned wala case
                studentCount++;
                if(studentCount > k || nums[i] > maxPages){
                    return false;
                }
                else{
                    //can asign to new student
                    pages = 0;
                    pages = pages + nums[i];
                }
                
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int ans = -1;

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        int e = sum;

        // int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(isValidAnswer(nums, k, mid)){
                //true wala case
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
}