
import java.util.Scanner;
import java.util.regex.Pattern;

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
    
    public int checkInputLimit(String object, int min, int max){
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
    
    public double checkNumeric(String msg){
        while (true) {
            try {
                System.out.print(msg );
                double semester = Double.parseDouble(sc.nextLine());   
                return  semester;
            }  catch (NumberFormatException e2) {
                System.err.println( " Must be digit");
            }
        }
    }
    
    public String checkOperator(String msg){
        Pattern pattern = Pattern.compile("^[*+-\\/^=]$");
        while(true){
            System.out.print(msg);
            String input = sc.nextLine();
            if(pattern.matcher(input).find()) {
                return input;
            }
            System.err.println("Must be (+, -, *, /, ^)");
        }
    }
}
