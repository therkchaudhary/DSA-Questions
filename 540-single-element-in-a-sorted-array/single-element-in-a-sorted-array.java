class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;
            //single element
            if(s == e){
                return nums[s];
            }
            //non-single element array
            //check whether mod element is a ans or not
            int currentValue = nums[mid];
            int prevValue = -1;
            if(mid-1 >= 0){
                prevValue = nums[mid-1];
            }
            int nextValue = -1;
            if(mid+1 < n){
                nextValue = nums[mid + 1];
            }

            if(currentValue != prevValue && currentValue != nextValue){
                //iska mtlb currentValue hi valid answer hai
                return currentValue; 
            }
            if(currentValue != prevValue && currentValue == nextValue){
                int StartingIndexOfPair = mid;
                if((StartingIndexOfPair & 1) == 1){
                    //startingIndex --> odd vala case
                    //ans left me hoga
                    e = mid - 1;
                }
                else{
                    //startingIndex --> even vala case
                    // ans right me hoga
                    s = mid + 1;
                }
            }
            else if(currentValue == prevValue && currentValue != nextValue){
                int endingIndexOfPair = mid;
                if((endingIndexOfPair & 1) == 1){
                    //ending index is odd
                    //ans right me hoga
                    s = mid + 1;
                }
                else{
                    //endingIndexOfPair is even
                    //move to left
                    e = mid - 1;
                }

            }
        }
        return -1;
    }
}