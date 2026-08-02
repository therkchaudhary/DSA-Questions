class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        //left pointer starting se 
        int left = 0;
        //right pointer last index se
        int right = n - 1;
        //maximum area store karne k liye
        int maxArea = 0;

        while(left < right){

            //dono pointer ke beech ki width
            int width = right - left;

            //chhoti wall hi water ki height decide karegi
            int currHeight = Math.min(height[left], height[right]);

            //current container ka area
            int area = width * currHeight;

            //agar current area bada hai to answer update kar do
            maxArea = Math.max(maxArea, area);

            //humesha chhoti height wale pointer ko move karenge
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}