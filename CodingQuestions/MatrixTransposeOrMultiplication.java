package CapgeminiCodingQuestions;

public class MatrixTransposeOrMultiplication {
    static int[][] matrixTranspose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        //int[][] transpose = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        if(matrix1[0].length!=matrix2.length){
            throw new IllegalArgumentException("Matrix 1 and Matrix 2 must have same length");
        }
        int[][] result = new int[matrix1[0].length][matrix2.length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                for(int k=0;k<matrix1[0].length;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }

            }

        }
        return result;
    }
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] result = matrixMultiplication(matrix, matrix);
        matrixTranspose(matrix);
        for(int[] row:matrix){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int[] row:result){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
