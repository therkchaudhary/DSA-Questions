package Sorting;

public class BubbleSort {
    static void bubbleSort(int[] arr){ //T.C -> 0(n^2)
        int n = arr.length;
        for(int i=0; i<n-1; i++){ //rounds
            for(int j=0; j<n-i-1; j++){ //neighbouring element comparison
                if(arr[j] > arr[j+1]){
                    //swap
                    int time = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = time;
                }
            }
        }
    }

    //******************************************************************

    static void selectionSort(int[] arr){ //T.C -> 0(n^2)
        //outer loop for rounds
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            //inner loop -> comparison arr[j] and arr[minIndex]
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //jab mera comparision complete ho jayega
            //toh mai MinIndec wali value ko correct position pr place krunga
            //swap arr[i], arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    //********************************************************************

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[i];
            while(prev>=0 && currValue < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //ab humare pass ek khali jagha aa chuki hai
            //place the currentVlaue
            arr[prev+1] = currValue;
        }
    }

    static void main(){
//        int arr[] = {6, 5, 1, 3};
//        bubbleSort(arr);
//        System.out.println("Printing the array: ");
//        for(int value: arr){
//            System.out.print(value + " " );
//        }

        //-------------------------------------------------------------

//        int arr[] = {6, 5, 1, 3, 4};
//        selectionSort(arr);
//        System.out.println("Printing the array: ");
//        for(int value: arr){
//            System.out.print(value + " " );
//        }

        //---------------------------------------------------------------

        int arr[] = {6, 5, 1, 3, 4, 2};
        insertionSort(arr);
        System.out.println("Printing the array: ");
        for(int value: arr){
            System.out.print(value + " " );
        }

    }
}
