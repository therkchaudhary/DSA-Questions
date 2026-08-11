class Solution {
    public int trap(int[] height) {
        // Left pointer starting se
        int left = 0;
        // Right pointer end se
        int right = height.length - 1;

        // Ab tak left side ki sabse badi height
        int leftMax = 0;
        // Ab tak right side ki sabse badi height
        int rightMax = 0;
        // Total trapped water store karega
        int water = 0;


        // Jab tak dono pointers mil nahi jaate
        while(left < right){

            // Agar left wali height chhoti ya equal hai
            if(height[left] <= height[right]){
                // Agar current height leftMax se badi hai,
                // to leftMax ko update kar do
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }
                else{
                    // Warna current bar ke upar itna water trap hoga
                    water += leftMax - height[left];
                }
                // Left pointer ko aage badhao
                left++;
            }
            else{
                // Agar current height rightMax se badi hai,
                // to rightMax update kar do
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }
                else{
                    // Warna current bar ke upar itna water trap hoga
                    water += rightMax - height[right];
                }

                 // Right pointer ko ek step left le aao
                right--;
            }
        }
        return water;
    }
}