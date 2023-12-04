
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
    public double checkInputMark(String nameSubject) {
        double number=0;
        while (true) {
            try {
                System.out.print(nameSubject+": ");
                 number = Double.parseDouble(sc.nextLine());
                if(number >10) {
                    System.err.println(nameSubject+" is less than equal ten");
                }
                else if (number<0) {
                    System.err.println(nameSubject+" is greater than equal zero");
                }
                else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println(nameSubject+" is digit");
            }
        }
        return number;
    }
    public String checkInputName(String msg) {
        String str;
        while (true) {
            System.out.println(msg);
                str= sc.nextLine().trim();
                if(!str.isEmpty()) {
                    break;
                }
                else {
                    System.err.println("Not empty!");
                }
           
        }
        return str;
    }
    public String checkYN() {      
        while(true) {
            System.out.println("Do you want to enter more student information?(Y/N):");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("N")|| choice.equalsIgnoreCase("Y"))
                return choice;
                        else System.out.println("Please input Y or N");
        }
    }
}
