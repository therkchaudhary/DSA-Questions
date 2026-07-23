package BinarySearch;

public class Lec45RotiPratha {
    static boolean isValidAns(int totalParatha, int cooks[], int totalCooks, int timeLimit){
        int paranthaCount = 0;
        //ek ek karke har cook k pass jayenge
        for(int i=0; i<cooks.length; i++){
            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;

            //currentCookRank --> R
            // 1*R, 2*R, 3*R, 4*R, - - - - - - - - -
            //cook karna start karwao
            while(timeTaken <= timeLimit){
                if(timeTaken + j * currentCookRank <= timeLimit){
                    //iska mtlb mai ye prantha bna sakta hu
                    timeTaken = timeTaken + j * currentCookRank;
                    paranthaCount++;
                    j++;
                }
                else {
                    //iska mtlb current prantha timeLimit k andr nahi ban sakta
                    break;
                }
            }
            //jab ye loop khatam hota hai, toh ye ith cook jitna parantha bana sakta tha,
            //unko PranthaCount me add kr chuka hota hai
            if(paranthaCount >= totalParatha){
                return true;
            }
        }

        if(paranthaCount >= totalParatha){
            return true;
        }
        else {
            return false;
        }
    }


    public int minTimeToCookPratas(int p, int[] cook, int n){
        //p -> number of parantha to cook
        //n -> number of cooks

        int maxRank = -1;
        for(int i=0; i<cook.length; i++){
            if(cook[i] > maxRank){
                maxRank = cook[i];
            }
        }

        int ans = -1;
        int s = 0;
        //R * (n*(n+1)/2) --> R = maxRank, p --> number of pranthas
        int e = maxRank * (p * (p+1)/2);

        while(s <= e){
            int mid = s + (e-s)/2;

            if(isValidAns(p, cook, n, mid)){
                //ans store
                ans = mid;
                //move to left
                e = mid - 1;
            }
            else{
                //move to right
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int p = 10; // Total parathas
        int[] cooks = {1, 2, 3, 4}; // Cook ranks
        int n = cooks.length;

        Lec45RotiPratha obj = new Lec45RotiPratha();

        int ans = obj.minTimeToCookPratas(p, cooks, n);

        System.out.println("Minimum time required = " + ans);
    }

}
