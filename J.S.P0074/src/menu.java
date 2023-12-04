/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class menu {
    Validation check = new Validation();
    public int displayMenu(){
        System.out.println("======== Calucator program==========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        int choice = check.checkInputLimit(1, 4, "Your Choice: ");
        return choice;
    }    
}
