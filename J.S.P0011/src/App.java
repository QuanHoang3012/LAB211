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

    Validation check = new Validation();
    Manager m = new Manager();
 

    public void convertFromBinary() {
        String binary = check.checkBaseInput("Enter Binary: ", "^[01]+$");
        int choice =m.displayConvert("Binary", "Decimal", "Hexadecimal");
        switch (choice) {
            case 1:
                System.out.print("After convert: ");
                System.out.println(m.BaseToDecimal(binary, 2));
                break;
            case 2:
                System.out.print("After convert: ");
                System.out.println(m.binaryToHexa(binary));
                break;
        }
    }

    public void covertFromDecimal() {
       String decimal = check.checkBaseInput("Enter Decimal: ", "^[0-9]+$");
        int choice = m.displayConvert("Decimal", "Binary", "Hexadecimal");
        switch (choice) {
            case 1:
                System.out.print("After convert: ");
                System.out.println(m.decimalToBase(decimal, 2));
                break;
            case 2:
                System.out.print("After convert: ");
                System.out.println(m.decimalToBase(decimal, 16));
                break;
        }
    }

    public void covertFromHexal() {
        String hexa = check.checkBaseInput("Enter hexadecimal: ", "^([0-9]*[A-F]*)$");
        int choice = m.displayConvert("Hexadecimal", "Binary", "Decimal");
        switch (choice) {
            case 1:
                System.out.print("After convert: ");
                System.out.println(m.hexaToBinary(hexa));
                break;
            case 2:
                System.out.print("After convert: ");
                System.out.println(m.BaseToDecimal(hexa, 16));
                break;
        }
    }
}
