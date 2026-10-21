class Solution {
    public void rotate(int[][] matrix) {
        
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        //taking transpose of the matrix
        for(int i=0; i<totalRows; i++) {
            for(int j=i+1; j<totalCols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reversing each row of matrix
        for(int i=0; i<totalRows; i++) {
            int ptr1=0;
            int ptr2=totalRows-1;

            while(ptr1<=ptr2){
                int temp = matrix[i][ptr1];
                matrix[i][ptr1] = matrix[i][ptr2];
                matrix[i][ptr2] = temp;
                ptr1++;
                ptr2--;

            }
        }

    }
}
