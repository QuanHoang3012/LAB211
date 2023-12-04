/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class main {

    public static void main(String[] args) {
        Caculator c = new Caculator();
        while (true) {
            int choice = c.displayMenu();
            switch (choice) {
                case 1:
                    c.normalCaculator();
                    break;
                case 2:
                    c.bmiCaculator();
                    break;
                case 3:
                    return;
            }
        }
    }
}
