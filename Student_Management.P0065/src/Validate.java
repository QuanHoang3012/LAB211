
import java.util.Scanner;

 
public class Validate {

    private Scanner sc = new Scanner(System.in);

    public Validate() {
    }

    public String iName() {
        String s;
        while (true) {
            try {
                System.out.print("Name: ");
                s = sc.nextLine().trim();
                if (s.matches("^[a-zA-Z]+$")) {
                    return s;
                }
            } catch (Exception e) {
                System.out.print("Name is a string: ");
            }
        }
    }
    
    public String iString() {
        String s;
        while (true) {
            try {
                System.out.print("Classes: ");
                s = sc.nextLine().trim();
                if (s.matches("^[a-zA-Z0-9]+$")) {
                    return s;
                }
            } catch (Exception e) {
                System.out.println("Classes is a string");
            }
        }
    }

    

    public double iPoint(String subject) {
        double mark;
        while (true) {
            try {
                System.out.print(subject + ": ");
                mark = Double.parseDouble(sc.nextLine());
                if (mark >= 0 && mark <= 10) {
                    return mark;
                } else if (mark < 0) {
                    System.out.println(subject + " is greater than equal zero");
                } else if (mark > 10) {
                    System.out.println(subject + " is less than equal ten");
                }
            } catch (NumberFormatException e) {
                System.out.println(subject + " is digit");
            }
        }
    }

    public boolean iYN() {
        char c;
        while (true) {
            try {
                System.out.print("Do you want to enter more student information?(Y/N): ");
                c = sc.next().charAt(0);
                sc.nextLine();
                if (c == 'y' || c == 'Y') {
                    return true;
                } else if (c == 'n' || c == 'N') {
                    return false;
                }
            } catch (Exception e) {
            }
        }
    }
}
