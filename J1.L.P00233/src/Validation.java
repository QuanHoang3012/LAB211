
import java.util.ArrayList;
import java.util.List;
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

    List<Fruit> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public String checkInputId(List<Fruit> list) {
        Pattern pattern = Pattern.compile("^[a-zA-Z1-9]+$");
        while (true) {
            String input = sc.nextLine();
            if (!pattern.matcher(input).find()) {
                System.err.println("Cannot have special character");
                System.out.print("Fruit ID: ");
                continue;
            } else {
                if (checkIdExist(list, input)) {
                    System.err.println("ID is existed, please enter again");
                    System.out.print("ID: ");
                    continue;
                } else {
                    return input;
                }
            }
        }
    }

    public boolean checkIdExist(List<Fruit> list, String iD) {
        boolean check = false;
        for (Fruit f : list) {
            if (f.getFruitId().equals(iD)) {
                check = true;
            }
        }
        if (check == true) {
            return true;
        }
        return false;
    }

    public String checkInputString(String msg) {
        Pattern pattern = Pattern.compile("^([a-zA-Z]+[\\s]?)+$");
        while (true) {
            String input = sc.nextLine().trim();
            if (!pattern.matcher(input).find()) {
                System.err.println("Invalid data");
                System.out.print(msg);
                continue;
            }
            return input;
        }
    }

    public int checkIntLimit(int min,int max, String object) {
        while (true) {
            try {
                double semester = Double.parseDouble(sc.nextLine());
                if (semester < min) {
                    System.err.println(object + " must be between "+min+" and "+max);
                    System.out.print(object + " : ");
                    continue;
                } else if ((int) semester != semester) {
                   System.err.println("Not real number");
                    System.out.print(object + " : ");
                    continue;
                } else {
                    return (int) semester;
                }
            } catch (NumberFormatException e2) {
                System.out.println(object + " must be digit");
                System.out.print(object + " : ");
            }
        }
    }
    public double checkDoubleLimit(double min, String object) {
        while (true) {
            try {
                double semester = Double.parseDouble(sc.nextLine());
                if ( semester < min) {
                    System.err.println(object + " must be greater than 0");
                    System.out.print(object + " : ");
                    continue;
                } else {
                    return  semester;
                }
            } catch (NumberFormatException e2) {
                System.out.println(object + " must be digit");
                System.out.print(object + " : ");
            }
        }
    }
    public String checkYN(String msg, String object) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.err.println("Not empty, try again");
                System.out.println(msg);
                continue;
            } else if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
                return input.toLowerCase();
            } else {
                System.err.println("Must be " + object);
                System.out.println(msg);
            }
        }
    }
}
