class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transpo = new int[column][row];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpo[j][i] = matrix[i][j];
            }
        }
        
        return transpo;
    }
}
