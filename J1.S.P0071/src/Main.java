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
        App a = new App();
        Validation check = new Validation();
        while (true) {
            int choice = a.menu();
            switch (choice) {
                case 1:
                    a.addTask();
                    break;
                case 2:
                    a.deleteTask();
                    break;
                case 3:
                    a.displayTask();
                    break;
                case 4:
                    return;
            }
        }
    }
}
