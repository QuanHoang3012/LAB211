/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Manager {

    Validation check = new Validation();

    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int column = matrix1[0].length;
        int[][] matrix3 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int column = matrix1[0].length;
        int[][] matrix3 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }

    public int[][] muptiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int column1 = matrix1[0].length;
        int row2 = matrix2.length;
        int column2 = matrix2[0].length;
        int[][] matrix3 = new int[row1][column2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                matrix3[i][j] = 0;
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < column1; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }

    public void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public int[][] inputMatrix(int n) {
        String str1= "Enter row Matrix "+n+": ";
        String str2 = "Enter colunm: "+n+": ";
        int  row1 = check.checkInputLimit(0, Integer.MAX_VALUE, str1);
        int column1 = check.checkInputLimit(0, Integer.MAX_VALUE,str2);
        int[][] matrix = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                String str3 = "Enter Matrix " + n + " [" + (i + 1) + "]" + "[" + (j + 1) + "] :";
                matrix[i][j] = check.checkInputMatrix(str3);
            }
        }
        return matrix;
    }

}
