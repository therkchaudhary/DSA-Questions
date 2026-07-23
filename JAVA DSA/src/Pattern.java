void main() {
//    int n = 3;
//    for(int row=1; row<=n; row++){
//        for(int col=1; col<=5; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }


    //--------------------------------------------

//    int n = 5;
//    for(int row=1; row<=n; row++ ){
//        for(int col=1; col<=row; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

    //----------------------------------------------

//    int n = 5;
//
//    for(int row=1; row<=n; row++){
//        //space
//        for(int col=1; col<=n-row; col++){
//            System.out.print(" ");
//        }
//        //star
//        for(int col=1; col<=n; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

    //-------------------------------------------------

//    int n=5;
//    for(int row=1; row<=n; row++){
//        for(int col=1; col<=n-row+1; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }


    //--------------------------------------------------
//    int n=5;
//    for(int row=1; row<=n; row++){
//        //spaces
//        for(int col=1; col<=n-row; col++){
//            System.out.print(" ");
//        }
//        for(int col=1; col<=2*row-1; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

    //-------------------------------------------------

//    int n=4;
//    for(int row=1; row<=n; row++){
//        for(int col=1; col<=row-1; col++){
//            System.out.print(" ");
//        }
//        for(int col=1; col<=2*n-2*row+1; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }


    //-------------------------------------------------

    int n = 10;
    for (int row = 1; row <= n; row++) {
        //for each row -> 6 columns
        for (int col = 1; col <= 6; col++) {
            if (row == 1 || row == n) {
                System.out.print("* ");
            } else {
                if (col == 1 || col == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}