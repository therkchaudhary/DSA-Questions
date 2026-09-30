class Solution {

    public int[] rowAndMaximumOnes(int[][] mat) {

        int totalRow = mat.length;
        int totalCol = mat[0].length;

        int maxi = -1;
        int maxOneWaliRowIndex = -1;

        // Move to each row and for each row
        // count the total number of 1's
        for(int row = 0; row < totalRow; row++){

            int oneCount = 0;

            // Traverse each column of the current row
            // and count the number of 1's
            for(int col = 0; col < totalCol; col++){

                if(mat[row][col] == 1){
                    oneCount++;
                }
            }

            // Update maxi and row index
            // only when current row has more 1's
            //
            // We use '>' instead of '>=' so that
            // if two rows have the same number of 1's,
            // the first row is automatically selected.
            if(oneCount > maxi){

                maxi = oneCount;
                maxOneWaliRowIndex = row;
            }
        }

        // Return [row index, maximum number of 1's]
        return new int[]{maxOneWaliRowIndex, maxi};
    }
}