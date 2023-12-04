/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Main {

    public static void main(String[] args) {
        App app = new App();
        Manager m = new Manager();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    app.convertFromBinary();
                    break;
                case 2:
                    app.covertFromDecimal();
                    break;
                case 3:
                    app.covertFromHexal();
                    break;
                case 4:
                    return;
            }
        }

    }
}
