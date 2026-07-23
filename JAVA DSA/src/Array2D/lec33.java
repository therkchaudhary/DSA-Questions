//WAVE PRINT A MATRIX


package Array2D;
import java.util .*;
import java.io .*;


public class lec33 {

    public List<Integer> wavePrintMatrix(int[][] matrix, int m, int n) {
        List<Integer> result = new ArrayList<>();

        //let move column wise
        for (int col = 0; col < n; col++) {
            //har ek column index ko check kro for even/odd
            if ((col & 1) == 1) {
                //odd
                //bottom to top
                for (int row = m - 1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            } else {
                //even
                //top to bottom
                for (int row = 0; row < m; row++) {
                    result.add(matrix[row][col]);
                }
            }
        }

        return result;
    }
}




