
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public int checkInputLimit(int min, int max, String object) {
        while (true) {
            try {
                System.out.print(object );
                double semester = Double.parseDouble(sc.nextLine());
                if (semester > max || semester < min) {
                    System.err.println( " Must be between " + min + " and " + max);
                    System.out.print(object);
                } else {
                    return (int) semester;
                }
            } catch (NumberFormatException e2) {
                System.err.println( " Must be digit");
            }
        }
    }
    
    public String checkInputString(String msg){
        while(true){
            System.out.print(msg);
            String input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.err.println("Not empty");
            }else {
                return input;
            }
        }
    }
    
    public String checkDate(String msg){
        while(true){
            try {
                System.out.print(msg);
            String result = sc.nextLine().trim();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date date = format.parse(result);
            if(result.equalsIgnoreCase(format.format(date))){
                return result;
            }else {
                System.err.println("Re-Input");
            }
            } catch (Exception e) {
                 System.err.println("Re-Input");
            }
            
        }
    }
    
    public double checkPlan(String msg){
        while(true){
            try {
                System.out.print(msg);
                double plan = Double.parseDouble(sc.nextLine());
                if(plan >= 8 && plan<=17.5 && plan%0.5==0)
                    return plan;
                else System.err.println("Re-Input");
            } catch (Exception e) {
                System.err.println("Re-Input");
            }
        }
    }
    
    public String checkTaskType(int ID){
        String result="";
        switch(ID){
            case 1 : 
                return "Code";
            case 2:
                 return "Test";
            case 3:
                return "Design";
            case 4: 
                return "Review";
        }
        return result;
    }
    
    
}
