import java.util.Scanner;

public class Arrays {
    static void main(){

//------------------------2D Arrays--------------------------------------

        //------------------Problem-4--------------------------------

        int arr[][] = {{1,2,3},{21,20,35}};
        int minValue = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] < minValue){
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println(minValue);


        //------------------Problem-3--------------------------------

//        int arr[][] = {{1,2,3},{21,20,35}};
//        int maxValue = arr[0][0];
//
//        for(int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                if(arr[i][j] > maxValue){
//                    maxValue = arr[i][j];
//                }
//            }
//        }
//        System.out.println(maxValue);


        //------------------Problem-2--------------------------------
//        int arr[][] = {{1,2,3},{1,2,3}};
//        int sum = 0;
//        int ans=1;
//
//        for(int i=0; i< arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                int value = arr[i][j];
//                ans = ans * value;
//            }
//        }
//        System.out.println(ans);


        //-------------------problem-1--------------------------------
//        int arr[][] = {{1,2,3}, {1,2,3}};
//        int sum = 0;
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++) {
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//        }
//        System.out.println(sum);

        //------------------------------------------------------------

//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        //input
//        for(int i=0; i<=arr.length-1; i++){
//            for(int j=0; j<=arr[i].length-1; j++){
//                System.out.println("Provide value for row=" + i + "and column= " + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        //print
//        for(int rowIndex = 0; rowIndex<=arr.length-1; rowIndex++){
//            for(int colIndex=0; colIndex<=arr[rowIndex].length-1; colIndex++){
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        //---------------------------------------------------------

//        //decleration
//        int[][] arr;
//        //allocation
//        arr = new int[3][4];
//        //init
//        int[][] brr = {
//                {1,2},
//                {2,3,4,5},
//                {3,4,4,5,6,7},
//                {4}
//        };
////        System.out.println(brr[3][1]);
//
//        int rowLength = brr.length;
////        int colLength = brr[0].length;
//        for(int row=0; row<=rowLength-1; row++){
//            //jaise hi mai kisi new row me aaya
//            //same point pr maine uss row ka colLength find out krliya
//            //current row -> brr[rowIndex]
//            //isme kitne columns -> brr[rowIndex].length
//            int colLength = brr[row].length;
//            for(int col=0; col<=colLength-1; col++){
//                System.out.print(brr[row][col] + " ");
//            }
//            System.out.println();
//        }












//--------------------------------1D Arrays------------------------------
        //----------------problem-4-------------------------------

//        int arr[] ={3,2,-5,21,10};
//        int n = arr.length;
//        int minValue = arr[0];
//
//        for(int i=0; i<=n-1; i++){
//            if(arr[i] < minValue){
//                minValue = arr[i];
//            }
//        }
//        System.out.println(minValue);

        //----------------problem-3-------------------------------

//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//        int maxValue = arr[0];
//
//        //compare maxValue ko array k har element k sath
//        for(int i=0; i<=n-1; i++){
//            if(arr[i] > maxValue){
//                //update maxValue
//                maxValue = arr[i];
//            }
//        }
//        System.out.println(maxValue);

        //--------------------question-2---------------------------

//        int arr[] = {2, 3, 10, 20};
//        int ans = 1;
//        int n = arr.length;
//
//        for(int i = 0; i<=n-1; i++){
//            int value = arr[i];
//            ans = ans * value;
//        }
//        System.out.println(ans);

        //-------------------question-1---------------------------

//        int arr[] = {10, 20, 30, 40, 50};
//        int sum = 0;
//        int n = arr.length;
//
//        for(int i=0; i<=n-1; i++){
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.println(sum);

        //---------------------------------------------------------

//        int arr[] = {12, 14, 1245};
//        int n = arr.length;
//        for(int i=0; i<=n-1; i++){
//            System.out.println(arr[i]);
//        }

        //----------------------------------------------------------

//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for(int i=0; i<=n-1; i++){
//            System.out.println("Provide input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //print
//        System.out.println("Your array contains: ");
//        for(int val: arr){
//            System.out.println(val);
//        }

        //-----------------------------------------------------

//        //declaration
//        int arr[];
//        //allocation
//        arr = new int[5];
//        //init
//        int brr[] = {10, 20, 30};

//        System.out.println("value at 0 index: "+ brr[0]);
//        System.out.println("value at 1 index: "+ brr[1]);
//        System.out.println("value at 2 index: "+ brr[2]);

        //---------------------------------------------------

//        int n = brr.length;
//        for(int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }

        //----------------------------------------------------

//        for(int val: brr){
//            System.out.println(val);
//        }

    }
}
