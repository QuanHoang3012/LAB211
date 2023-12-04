
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

    public String checkBaseInput(String msg, String regex) {
        Pattern pattern = Pattern.compile(regex);
        while (true) {
            System.out.print(msg);
            String base = sc.nextLine().trim();
            if (pattern.matcher(base).find()) {
                return base;
            }
            System.err.println("Error");
        }
    }


    public int checkIntInput(int min, int max, String object) {
        while (true) {
            try {
                System.out.print(object + " : ");
                double input = Double.parseDouble(sc.nextLine());
                if (input < min || input > max) {
                    System.err.println("Must be between " + min + " and " + max);
                    System.out.print(object + " : ");
                } else if ((int) input != input) {
                    System.err.println("Not real number, try again");
                } else {
                    return (int) input;
                }
            } catch (NumberFormatException e2) {
                System.out.println(" Must be digit");
                System.out.print(object + " : ");
            }
        }
    }

}
