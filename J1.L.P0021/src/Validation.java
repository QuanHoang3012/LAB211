

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {

    List<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public String checkName( String msg) {
        Pattern pattern = Pattern.compile("^([a-zA-Z]+[\\s]?)+$");
        while (true) {
            System.out.print(msg);
            String name = sc.nextLine().trim();
            if (pattern.matcher(name).find()) {
                return name.toUpperCase();
            } else {
                System.err.println("Invalid name, please try again");
            }
        }
    }

    public String checkID() {
        Pattern pattern = Pattern.compile("^[Hh][ESes][0-9]{6}$");
        while (true) {
            System.out.print("ID: ");
            String id = sc.nextLine();
            if (pattern.matcher(id).find()) {
                return id.toUpperCase();
            } else {
                System.err.println("Error format, please try again, Id example HE186591");
            }
        }
    }

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
    
    
    public String checkCourse() {
        while (true) {
            System.out.print("Course: ");
            String course = sc.nextLine();
            if (course.equalsIgnoreCase("java")) {
                return "Java";
            } else if (course.equalsIgnoreCase(".net")) {
                return ".Net";
            } else if (course.equalsIgnoreCase("c/c++")) {
                return "C/C++";
            } else {
                System.err.println("There are only three courses: Java, .Net, C/C++).");
            }
        }
    }

    public String checkYNAndUD(String msg, String object) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.err.println("Not empty, try again");
            } else if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("u") || input.equalsIgnoreCase("n") || input.equalsIgnoreCase("d")) {  //////////////////// chua toi uu nen chia 2 truong hop 
                return input.toLowerCase();
            } else {
                System.err.println("Must be " + object);
            }
        }
    }


}
