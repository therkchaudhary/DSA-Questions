class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // Final answer store karne ke liye (isme saare unique triplets aayenge)
        List<List<Integer>> ans = new ArrayList<>();

        // Array ko sort kar rahe hain taki Two Pointer technique use kar sake
        Arrays.sort(nums);
        int n = nums.length;

        // Har element ko ek baar first element maan kar check karenge
        for(int i=0; i < n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            //second element k liye left pointer
            int left = i+1;

            //third element k liye right pointer
            int right = n-1;

            // Jab tak dono pointers cross nahi karte tab tak search karte rahenge
            while(left < right){

                // Teenon numbers ka sum nikal rahe hain
                int sum = nums[i] + nums[left] + nums[right];

                // Agar sum 0 hai to hume ek valid triplet mil gaya
                if(sum == 0){

                    // Triplet ko answer list me add kar do
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Dono pointers ko move karo
                    left++;
                    right--;

                     // Left side ke duplicate elements skip karo
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }

                     // right side ke duplicate elements skip karo
                     while(left < right && nums[right] == nums[right+1]){
                        right--;
                     }
                }
                // Sum chhota hai, isliye bada number chahiye
                else if(sum < 0){
                    left++;
                }
                // Sum bada hai, isliye chhota number chahiye
                else{
                    right--;
                }
            }
        }
        return ans;
    }
}