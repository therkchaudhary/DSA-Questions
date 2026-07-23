package Array;

import java.util.HashMap;

public class ArrayManipulationProblems2 {

    //******************************************************************
    //Reverse an Array

//    static void reverseArray(int arr[]){
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//
//        while (i<=j){
//            //swap
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            //i ko aage badhao
//            i++;
//            //j ko picche laao
//            j--;
//
//        }
//        //now your array has been reversed
//        //print
//        for(int k : arr){
//            System.out.print(k +","+ " ");
//        }
//    }
//
//    static void main(){
//        int arr[] = {1,2,3,4,5};
//        reverseArray(arr);
//    }
//
//    //Time complexity --> O(n)
//    //Space complexity --> O(1)

    //*******************************************************************
    //Shift array elements by 1 Position

//    static void shiftBy1(int[] arr){
//        //step1: store last wale ki value
//        int n  = arr.length;
//        int temp = arr[n-1];
//        //step2: shift all values of array
//        for (int i=n-1; i>0; i--){
//            arr[i] = arr[i-1];
//        }
//        //step3: temp ki value ko 0 index pr copy
//        arr[0] = temp;
//    }
//
//    static void main(){
//        int arr[] = {1,2,3,4,5};
//        shiftBy1(arr);
//        for (int a: arr){
//            System.out.print(a + " ");
//        }
//        System.out.println();
//
//    }
//
////    Time complexity --> O(n)
////    Space complexity --> O(1)

    //****************************************************************
    //find the mode(Highest frequency ) of array

//    static int getMode(int arr[]){
//        HashMap<Integer, Integer> freq = new HashMap<>();
//
//        for(int num:arr){
//            freq.put(num, freq.getOrDefault(num, 0) + 1);
//        }
//
////        for(int i: freq.keySet()){
////            //i -> will represent key
////            System.out.println(i +" -> " + freq.get(i));
////        }
//
//        int maxFreq = -1;
//        int maxFreqWaliKey = -1;
//
//        for(int key: freq.keySet()){
//            int currentKey = key;
//            int currentKeyKiFrequency = freq.get(key);
//            if(currentKeyKiFrequency > maxFreq){
//                //mujhe naya max mil gya
//                maxFreq = currentKeyKiFrequency;
//                maxFreqWaliKey = currentKey;
//            }
//        }
//        //jab loop se bahar aaoge toh max freq wali key ready hogi
//        return maxFreqWaliKey;
//    }
//
//    static void main(){
//        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5,5};
//        int ans = getMode(arr);
//        System.out.println(ans);
//    }
//
//    //Time complexity --> O(n)
//    //space complexity --> O(n)


    //***************************************************************
    //Identify elements with Highest and Lowest Frequency

    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        //insert data
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        //hashmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > highestFreq){
                //highest ko updatekrna chahiye
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq){
                //its time to update
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }

    static void main(){
        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5,5};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println("Highest freq wala num --> " + ans[0]);
        System.out.println("Lowest freq wala num --> " + ans[1]);
    }

    //Time complexity --> O(n)
    //Space complexity --> O(n)




















}
