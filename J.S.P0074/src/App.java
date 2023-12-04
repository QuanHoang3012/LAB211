/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class App {

    Manager m = new Manager();
    Validation check = new Validation();

    public void addition() {
            System.out.println("---------------Addition---------------");
            int[][] matrix1 = m.inputMatrix(1);
            int[][] matrix2 = m.inputMatrix(2);
            
            if (!check.checkMatrixSymmetrical(matrix1, matrix2)) {
                System.err.println("Cannot caculate");
            } else {
                m.display(matrix1);
                System.out.println("+");
                m.display(matrix2);
                System.out.println("=");
                m.additionMatrix(matrix1, matrix2);
                int [][]matrix3 =m.additionMatrix(matrix1, matrix2);
                m.display(matrix3);
            }
    }

    public void subtraction() {
            System.out.println("---------------Subtraction---------------");
            int[][] matrix1 = m.inputMatrix(1);
            int[][] matrix2 = m.inputMatrix(2);
            if (!check.checkMatrixSymmetrical(matrix1, matrix2)) {
                System.err.println("Cannot caculate");
            } else {
                m.display(matrix1);
                System.out.println("-");
                m.display(matrix2);
                System.out.println("=");
                int [][]matrix3 =m.subtractionMatrix(matrix1, matrix2);
                m.display(matrix3);
            }
        }
    
    
    public void mutply(){
            System.out.println("---------------Multply---------------");
            int[][] matrix1 = m.inputMatrix(1);
            int[][] matrix2 = m.inputMatrix(2);
            if (!check.checkMatrixMutiply(matrix1, matrix2)) {
                System.err.println("Cannot caculate");
            } else {
                m.display(matrix1);
                System.out.println("*");
                m.display(matrix2);
                System.out.println("=");
                 int [][]matrix3 =m.muptiplicationMatrix(matrix1, matrix2);
                m.display(matrix3);
            }
    }
}
