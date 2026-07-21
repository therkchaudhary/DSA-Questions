class Solution {

    static boolean isValidAns(int[] position, int k, int minDistance){
        //brute force
        int ballCount = 1;
        //first ball is placed at 0 index
        int lastPosition = 0;
        
        for(int i=1; i<position.length; i++){
            //current ball ko current posiyion pr tabhi place kar paunga
            //jab current and prev ball k neech ka distance
            //>=minDistance ho
            if(position[i] - position[lastPosition] >= minDistance){
                //can place safely
                ballCount++;
                //kyuki new ball place ho chuki hai
                // iska mtlb lastPosition ko update krna pdega
                lastPosition = i;
                if(ballCount == k){
                    //iska mtlb aap saari ball place kr chuke hai 
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int k) {
        Arrays.sort(position);
        int n  = position.length;

        int s = 0;
        int e = position[n-1] - position[0];
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(isValidAns(position, k, mid)){
                //hume ek possible solution mil gya
                //ans store
                //move to right
                ans = mid;
                s = mid + 1;
            }
            else{
                //mid k sath there is no possible arrangement to place
                //balls
                //move to left
                e = mid - 1;

            }
        }
        return ans;
    }
}