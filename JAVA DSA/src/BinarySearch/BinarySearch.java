package BinarySearch;

public class BinarySearch {
    //Number of occurrence
    //given a sorted array, arr[] and a number target,
    // you need to find the number of occurrences

    static int getLowerBound(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int lbAns = n;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] >= target){
                //ans store
                lbAns = mid;
                //move to left
                e = mid-1;
            }
            else {
                //right move
                s = mid + 1;
            }
        }
        return lbAns;
    }

//    static void main(){
//        int arr[] ={10,20, 30, 30, 30, 30, 30, 40, 50};
//        int target = 35;
//        int ans = getLowerBound(arr, target);
//        System.out.println("and: " + ans);
//    }


    //*********************** upperBound *******************************

    static int getUpperBound(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ubAns = n;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] <= target){
                //move to right
                s = mid + 1;
            }
            else{
                //arr[mid] > target
                //ans store
                ubAns = mid;
                //move left
                e = mid-1;
            }
        }
        return ubAns;
    }


    static void main(){
        int arr[] ={10, 20, 30, 30, 30, 30, 30, 40, 50};
        int target = 30;

        int lbAns = getLowerBound(arr, target);
        int ubAns = getUpperBound(arr, target);

        System.out.println("lbAns: " + lbAns);
        System.out.println("ans: " + ubAns);

        System.out.println("Frequency: " + countFreq(arr, target));
    }

    static int countFreq(int[] arr, int target){
        int lbIndex = getLowerBound(arr, target);
        int ubIndex = getUpperBound(arr, target);
        int ans = ubIndex - lbIndex;
        return ans;
    }


}
