package Array;


public class ArrayProblems1 {

    //************************************************************
    //Find the average of array elements

//    static double getAverage(int[] arr) {
//        double sum = 0;
//        for(int i : arr){
//            sum += i;
//        }
//        int size = arr.length;
//        double avg = sum / size;
//        return avg;
//    }
//
//    static void main() {
//        int[] arr = {2, 4, 1, 3};
//        System.out.println(getAverage(arr));
//    }

    //****************************************************************
    //Multiply each element of array by 10.

//    static int[] multiplyBy10(int[] arr){
//        int size = arr.length;
//        int newArray[] = new int[size];
//
//         for (int i=0; i<size; i++){
//             int element = arr[i];
//             int newElement = element * 10;
//             newArray[i] = newElement;
//         }
//         //return updated array
//        return newArray;
//    }
//
//    static void main(){
//        int[] arr = {1, 2, 3, 4, 5};
//        int ans[] = multiplyBy10(arr);
//        System.out.println("Printing ans array: ");
//        for(int i:ans){
//            System.out.println(i);
//        }
//    }

    //*****************************************************************
    //search for an element in array {Linear search}

//    static boolean findTarget(int arr[], int target){
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == target){
//                return true;
//            }
//        }
//        //agar poora array travel ho chuka hai
//        //and ek baar bhi target nhi mila
//        //iska mtlb, target is not present in array
//        //return false
//        return false;
//    }
//
//    static void main(){
//        int arr[] = {1,3, 5, 7,9};
//        boolean ans = findTarget(arr, 90);
//        System.out.println(ans);
//    }


    //****************************************************************
    //find the maximum element in an array

//    static int getMaximum(int arr[]){
//        int maxi = arr[0];
//
//        for(int i=0; i<arr.length; i++){
////            if(arr[i] > maxi){
////                maxi = arr[i];
////            }
//            maxi = Math.max(maxi, arr[i]);
//        }
//        //jab main yaha pahochunga, toh poora aaray compare ho chuka hoga
//        //and maxi k andar sabse badi value hogi
//        return maxi;
//    }
//
//    static void main(){
//        int arr[] = {1, 3, 5, 7, 9};
//        System.out.println(getMaximum(arr));
//    }

    //*****************************************************************
    //Return sum of +ve and -ve numbers

//    static int[] getPosNesSum(int arr[]){
//        int posSum = 0;
//        int negSum = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > 0){
//                //num is positive
//                posSum = posSum + arr[i];
//            }
//            else{
//                //num is negative
//                negSum = negSum + arr[i];
//            }
//        }
//        int ans[] = {posSum, negSum};
//        return ans;
//    }
//
//    static  void main(){
//        int arr[] = {2,-3,-5,-7,9};
//        int ans[] = getPosNesSum(arr);
//        System.out.println("Positive sum = " + ans[0]);
//        System.out.println("Negative sum = " + ans[1]);
//    }


    //****************************************************************
    //count the number of zeroes and ones

//    static int[] getZeroOneCount(int arr[]){
//        int zeroCount = 0;
//        int oneCount = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if (arr[i] == 0){
//                zeroCount++;
//            }
//            else {
//                oneCount++;
//            }
//        }
//        int ans[] = {zeroCount, oneCount};
//        return ans;
//    }
//
//    static void main(){
//        int arr[] = {1,0,1,1,0,1,1};
//        int ans[] = getZeroOneCount(arr);
//        System.out.println("ZeroCount = " + ans[0]);
//        System.out.println("OneCount = " + ans[1]);
//    }
//
//    //Time complexity --> O(n)
//    //Space complexity --> O(1)


    //*****************************************************************
    //Find the first unsorted element in array

//    static int getUnsortedElement(int arr[]){
//        for(int i=0; i<arr.length; i++) {
////            if(arr[i+1] > arr[i]){
////                //toh kuch krne ki need nhi h
////                //aage badho
////            }
////            else {
////                return arr[i+1];
////            }
//
//            if (arr[i + 1] <= arr[i]) {
//                return arr[i + 1];
//            }
//        }
//        //is case me loop se bahar aa jaunga
//        return -1;
//    }
//
//    static void main(){
//        int arr[] ={1,2,5,4,9};
//        System.out.println(getUnsortedElement(arr));
//    }

    //Time complexity--> O(n)
    //Space complexity--> O(1)

    //****************************************************************
    //Swap Alternate Elements in an array

//    static void swapAlternate(int[] arr) {
//        for(int i = 0; i<arr.length; i=i+2){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//    }
//
//    static void main() {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//
//        swapAlternate(arr);
//
//        for (int num : arr){
//            System.out.print(num + " ");
//        }
//    }

//    Time Complexity --> O(n)
//    Space Complexity --> O(1)


    //*****************************************************************
    //Print Array Intersection element

//    public static void intersection(int[] arr1, int[] arr2){
//        for(int i=0; i<arr1.length; i++){
//            for (int j=0; j<arr2.length; j++){
//                if(arr1[i] == arr2[j]){
//                    System.out.println(arr1[i] + " ");
//                    arr2[j] = Integer.MIN_VALUE;
//                    break;
//                }
//            }
//        }
//    }
//
//    static void main(String[] args) {
//        int[] arr1 = {2, 6, 8, 5, 4, 3};
//        int[] arr2 = {2, 3, 4, 7};
//
//        intersection(arr1, arr2);
//    }

//    ****************************************************************
//    Print Alternate Extreme Elements of an array

    public static void printAlternateExtreme(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if(start == end){
                System.out.println(arr[start] + " ");
                return;
            }else {
                System.out.println(arr[start] + " ");
                start++;
                System.out.println(arr[end] + " ");
                end--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        printAlternateExtreme(arr);
    }

    //Time complexity --> O(n)
    //Space complexity --> O(1)









}



