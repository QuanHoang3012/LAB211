
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Validation {
    Scanner sc = new Scanner(System.in);
    public int checkInputLimit(int min, int max, String object){
        while (true) {
            try {
                System.out.print(object );
                double semester = Double.parseDouble(sc.nextLine());
                if (semester > max || semester < min) {
                    System.err.println(object + " must be greater than 0");
                } else if ((int) semester != semester){
                    System.err.println("Not real number");
                }
                else {
                    return (int) semester;
                }
            }  catch (NumberFormatException e2) {
                System.err.println(object + " must be digit");
            }
        }
      
    }
    public int checkInputMatrix(String msg ){
        while (true) {
            try {
                System.out.print(msg );
                double semester = Double.parseDouble(sc.nextLine());   
                return  (int) semester;
            }  catch (NumberFormatException e2) {
                System.err.println( " Must be digit");
            }
        }
    }
    
    public boolean checkMatrixSymmetrical(int[][] matrix1, int [][] matrix2){
       return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }
    
    public boolean checkMatrixMutiply(int[][] matrix1, int [][] matrix2){
        return matrix1[0].length == matrix2.length ;
    }
    
    
    
}
