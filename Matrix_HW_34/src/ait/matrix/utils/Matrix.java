package ait.matrix.utils;

public class Matrix {
    public static int sum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int[][] transp(int[][] matrix){
        int[][] transpMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpMatrix[j][i] = matrix[i][j];
            }
        }
        return transpMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        if (matrix1[0].length != matrix2.length){
            return null;
        }

        int[][] multyMatrix = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < multyMatrix.length; i++) {
            for (int j = 0; j < multyMatrix[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    multyMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multyMatrix;
    }
}