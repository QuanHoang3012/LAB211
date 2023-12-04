
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
public class Main {
    public static void main(String[] args) {
        menu m = new menu();
        App app = new App();
        while (true) {            
            int choice = m.displayMenu();
            switch(choice){
                case 1: 
                    app.addition();
                    break;
                case 2: 
                    app.subtraction();
                    break;
                case 3:
                    app.mutply();
                    break;
                case 4 :
                    return;
            }
        }
      
    }
    
}
