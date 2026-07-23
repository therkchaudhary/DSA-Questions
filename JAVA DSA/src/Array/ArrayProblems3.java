package Array;

public class ArrayProblems3 {

    //given an array consisting only of 0s and 1s. write a function to sort
    //this array so that all 0s are placed before any 1s. The goal is to archive
    //this sorting in an efficient manner, with optimal use of time and space resources.

//    public int[] sortArray(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//
//        while(i<j){
//            if (arr[i] == 1 && arr[j] == 0){
//                //swap
//                arr[i] = 0;
//                arr[j] = 1;
//            }
//            if(arr[i] == 0){
//                //i ko aage le jao
//                i++;
//            }
//            if(arr[j] == 1){
//                //j ko decrement krdo
//                j--;
//            }
//        }
//        return arr;
//    }
//    static void main(String[] args){
//        int[] arr = {1,1,0,1,0,0,};
//
//        ArrayProblems3 obj = new ArrayProblems3();
//        arr = obj.sortArray(arr);
//
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//    }


    //********************************************************************
    //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

//    public int missingNumber(int[] nums) {
//        int xorSum = 0;
//        //xor sum with all the array elements
//        for(int n: nums){
//            xorSum = xorSum ^ n;
//        }
//        //xor with all the element in the range
//        int n = nums.length;
//        for(int i=0; i<=n; i++){
//            xorSum = xorSum ^ i;
//        }
//        return xorSum;
//    }
//
//    static void main(String[] args){
//        int[] arr = {3,0,1,4,5};
//
//        ArrayProblems3 obj = new ArrayProblems3();
//        int ans = obj.missingNumber(arr);
//
//        System.out.println(ans);
//    }


    //******************************************************************
    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    //You must implement a solution with a linear runtime complexity and use only constant extra space.

    public int singleNumber(int[] nums) {
        int xorSum = 0;
        for(int n: nums){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    static void main(String[] args){
        int[] arr = {2,4,5,2,4};

        ArrayProblems3 obj = new ArrayProblems3();
        int ans = obj.singleNumber(arr);

        System.out.println(ans);
    }
}
